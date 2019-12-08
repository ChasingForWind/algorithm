package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            Queue<ListNode> queue = new LinkedList<>();
            for (int i=0;i<lists.length;i++){
                queue.add(lists[i]);
            }
            while (queue.size()>1){
                ListNode list1 = queue.poll();
                ListNode list2 = queue.poll();
                ListNode newList = mergeTwoLists(list1, list2);
                queue.add(newList);
            }
            return queue.poll();
        }
        public ListNode mergeTwoLists(ListNode L1,ListNode L2){
            ListNode newList = new ListNode(0);
            ListNode head = newList;
            while (L1!=null&&L2!=null){
                if (L1.val<L2.val){
                    newList.next = new ListNode(L1.val);
                    newList = newList.next;
                    L1=L1.next;
                }else {
                    newList.next = new ListNode(L2.val);
                    newList = newList.next;
                    L2=L2.next;
                }
            }
            while (L1!=null){
                newList.next=new ListNode(L1.val);
                newList = newList.next;
                L1=L1.next;
            }
            while (L2!=null){
                newList.next=new ListNode(L2.val);
                newList = newList.next;
                L2=L2.next;
            }
            return head.next;
        }
    }
    /*
    class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return solve(lists, 0, lists.length-1);
    }

    private ListNode solve(ListNode[] arr, int left, int right){
        if(left == right) return arr[left];

        int mid = (left + right) >> 1;
        ListNode lNode = solve(arr, left, mid);
        ListNode rNode = solve(arr, mid+1, right);

        return merge(lNode, rNode);
    }

    private ListNode merge(ListNode node1, ListNode node2){
        if(node1 == null) return node2;
        if(node2 == null) return node1;

        if(node1.val < node2.val){
            node1.next = merge(node1.next, node2);
            return node1;
        }else{
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}

}*/

}
