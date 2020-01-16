import classes.ListNode;

public class 面试题25 {
    public class Solution {
        public ListNode Merge(ListNode list1, ListNode list2) {

            if (list1==null) return list2;
            if (list2==null) return list1;

            ListNode index1 = list1;
            ListNode index2 = list2;
            ListNode p = null;
            ListNode head = null;

            if (list1.val>list2.val){
                p=index2;
                head = p;
                index2 = index2.next;
            }else {
                p=index1;
                head = p;
                index1 = index1.next;
            }

            while (index1!=null&&index2!=null){
                if (index1.val<index2.val){
                    p.next = index1;
                    p=p.next;
                    index1=index1.next;
                }else {
                    p.next = index2;
                    p=p.next;
                    index2=index2.next;
                }
            }
            if (index1!=null) p.next = index1;
            else p.next = index2;
            return head;
        }
    }
}
