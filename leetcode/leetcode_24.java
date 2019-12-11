package leetcode;

public class leetcode_24 {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode temp = new ListNode(1);
            temp.next = head;
            ListNode c=temp;
            while (c.next!=null&&c.next.next!=null){
                ListNode a = c.next;
                ListNode b = a.next;
                ListNode store = b.next;
                c.next = b;
                b.next=a;
                a.next=store;
                c=a;
            }
            return temp.next;
        }
    }
}
