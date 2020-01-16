import classes.ListNode;

public class 面试题22 {
    public class Solution {
        public ListNode FindKthToTail(ListNode head, int k) {
            if (k<=0) return null;
            if (head==null) return null;
            ListNode index = head;
            int i=0;
            while (i<k-1){
                if (index.next!=null){
                    index = index.next;
                }else{
                    return null;
                }
                i++;
            }
            while (index.next!=null){
                index = index.next;
                head=head.next;
            }
            return head;
        }
    }
}
