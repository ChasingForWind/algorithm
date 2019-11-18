package leetcode;

public class leetcode_19 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode list = head;
            while (list!=null){
                list=list.next;
                n--;
            }
            if (n>0) return null;
            else if (n==0) return head.next;
            else {
                list=head;
                while (n<-1){
                    n++;
                    list=list.next;
                }
                list.next=list.next.next;
            }
            return head;
        }
    }
}
