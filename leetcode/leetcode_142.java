package leetcode;

public class leetcode_142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            if (head==null) return null;
            while (fast!=slow){
                if (fast==null) return null;
                if (fast.next==null) return null;
                fast=fast.next.next;
                slow = slow.next;
                System.out.println();
            }
            fast = head;
            while (fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
    }
}
