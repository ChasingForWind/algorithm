package leetcode;

public class leetcode_876 {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode t1 = head;
            ListNode t2 = head;
            while (t2.next!=null&&t2.next.next!=null){
                t1 = t1.next;
                t2 = t2.next.next;
            }
            if (t2.next==null) return t1;
            else return t1.next;
        }
    }
}
