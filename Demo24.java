public class Demo24 {
    /*输入两个链表，找出它们的第一个公共结点。*/
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if (pHead1==null||pHead2==null){
                return null;
            }
            int length1 = getLength(pHead1);
            int length2 = getLength(pHead2);

            if (length1>=length2){
                int len = length1-length2;
                while (len>0){
                    pHead1 = pHead1.next;
                    len--;
                }
            }else if (length2>length1){
                int len = length2 - length1;
                while (len>0){
                    pHead2 = pHead2.next;
                    len--;
                }
            }

            while (pHead1!=null&&pHead2!=null){
                if (pHead1.val==pHead2.val) return pHead1;
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return null;
        }

        //得到链表长度
        public int getLength(ListNode pHead){
            int length = 0;
            while(pHead!=null){
                length++;
                pHead=pHead.next;
            }
            return length;
        }
    }
}
