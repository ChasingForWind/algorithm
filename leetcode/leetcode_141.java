package leetcode;

public class leetcode_141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head==null) return false;
            ListNode low = head;
            ListNode fast;
            if (head.next!=null){
                fast = head.next;
            }else return false;
            while (low!=fast){
                if ((fast==null)){
                    return false;
                }
                low = low.next;
                if (fast.next ==null) return false;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
