import classes.ListNode;

public class 面试题24 {
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if (head==null) return null;
            ListNode before = null;
            ListNode after = head;
            ListNode p =null;
            while (after!=null){
                p = after;
                after = after.next;
                p.next = before;
                before = p;
            }
            return before;
        }
    }
}
