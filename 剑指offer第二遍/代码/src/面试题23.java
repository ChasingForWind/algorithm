import classes.ListNode;

public class 面试题23 {
    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead)
        {
            if (pHead==null||pHead.next==null) return null;
            int k = 1;
            ListNode index1 = pHead;
            ListNode index2 = pHead.next;
            while (index1!=index2){
                if (index1.next!=null||index2.next.next!=null){
                    index1 = index1.next;
                    index2 = index2.next.next;
                }else {
                    return null;
                }
            }
            index2=index1.next;
            while (index2!=index1){
                index2=index2.next;
                k++;
            }
            index1 = pHead;
            index2 = pHead;
            for (int i = 0; i < k; i++) {
                index1 = index1.next;
            }
            while (index1!=index2){
                index1 = index1.next;
                index2 = index2.next;
            }
            return index1;
        }
    }
}
