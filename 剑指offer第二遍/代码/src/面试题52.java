import classes.ListNode;

public class 面试题52 {
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

            if (pHead1==null||pHead2==null) return null;
            ListNode index1 = pHead1;
            ListNode index2 = pHead2;
            int count=0;
            while (index1!=null&&index2!=null){
                index1 = index1.next;
                index2 = index2.next;
            }
            if (index1==null){
                while (index2!=null){
                    count++;
                    index2 = index2.next;
                }
                for (int i = 0; i < count; i++) {
                    pHead2 = pHead2.next;
                }
                while (pHead1!=pHead2){
                    pHead1=pHead1.next;
                    pHead2=pHead2.next;
                }
                return pHead1;
            }
            else {
                while (index1!=null){
                    count++;
                    index1 = index1.next;
                }
                for (int i = 0; i < count; i++) {
                    pHead1 = pHead1.next;
                }
                while (pHead1!=pHead2){
                    pHead1=pHead1.next;
                    pHead2=pHead2.next;
                }
                return pHead1;
            }
        }
    }
}
