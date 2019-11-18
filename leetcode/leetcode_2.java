package leetcode;

public class leetcode_2 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode list = null;
            ListNode head = null;
            int flag = 0;
            int value = 0;
            while (l1 != null && l2 != null) {
                int temp = l1.val + l2.val + flag;
                value = temp % 10;
                flag = temp / 10;
                if (list==null) {
                    list = new ListNode(value);
                    head=list;
                }else {
                    list.next = new ListNode(value);
                    list = list.next;
                }
                l1=l1.next;
                l2=l2.next;
            }
            while (l1!=null){
                int temp = l1.val+flag;
                value = temp % 10;
                flag = temp / 10;
                if (list==null) {
                    list = new ListNode(value);
                    head=list;
                }else {
                    list.next = new ListNode(value);
                    list = list.next;
                }
                l1=l1.next;
            }
            while (l2!=null){
                int temp = l2.val+flag;
                value = temp % 10;
                flag = temp / 10;
                if (list==null) {
                    list = new ListNode(value);
                    head=list;
                }else {
                    list.next = new ListNode(value);
                    list = list.next;
                }
                l2=l2.next;
            }
            if(flag!=0){
                list.next = new ListNode(flag);
            }
            return list;
        }
    }
}
