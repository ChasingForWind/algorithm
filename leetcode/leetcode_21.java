package leetcode;

public class leetcode_21 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode phead = new ListNode(-1);
            ListNode p3 = phead;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    p3.next = l1;
                    l1 = l1.next;
                } else {
                    p3.next = l2;
                    l2 = l2.next;
                }
                p3 = p3.next;
            }
            if (l1!=null){
                p3.next = l1;
            }
            if (l2!=null){
                p3.next = l2;
            }
            return phead.next;
        }
    }
}
