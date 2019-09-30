public class Demo28 {
    /*输入一个链表，输出该链表中倒数第k个结点。*/
    public class Solution {
        public ListNode FindKthToTail(ListNode head,int k) {
            //鲁棒性
            if (head==null||k==0){
                return null;
            }
            //定义一个在前面走的指针
            ListNode k1 = head;
            while (k>1){//注意这里是大于1，因为要求两个指针的距离保持在k-1
                if (k1.next!=null){
                    k1 = k1.next;
                    k--;
                }else {
                    return null;
                }
            }
            //定义在后面的指针
            ListNode k2 = head;
            while (k1.next!=null){
                k1 = k1.next;
                k2 = k2.next;
            }
            return k2;
        }
    }
}
