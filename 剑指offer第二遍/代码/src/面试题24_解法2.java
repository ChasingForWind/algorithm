import classes.ListNode;


/*使用递归的方法反转链表*/
public class 面试题24_解法2 {
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if (head==null||head.next==null) return head;
            ListNode preNode = ReverseList(head.next);
            head.next.next = head;
            head.next = null;
            return preNode;
        }
    }
}
