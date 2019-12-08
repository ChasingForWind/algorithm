package leetcode;

public class leetcode_92 {
    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode flagPre=null;
            ListNode fin=null;
            int count =1;
            ListNode orgHead = head;
            while (head!=null){
                if (count==m-1) flagPre=head;
                if (count==n+1) fin=head;
                head=head.next;
                count++;
            }
            ListNode pre = flagPre;
            ListNode cur = pre.next;
            int flag=1;
            while (cur.next!=fin){
                if (flag==1){
                    ListNode next = cur.next;
                    cur.next=fin;
                    pre = cur;
                    cur=next;
                    flag=0;
                }
                ListNode next = cur.next;
                cur.next=pre;
                pre = cur;
                cur=next;
            }
            cur.next=pre;
            flagPre.next=cur;
            return orgHead;
        }
    }
}
