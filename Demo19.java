public class Demo19 {
    /*输入一个链表，反转链表后，输出新链表的表头。*/
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            //当表头为null时返回null
            if (head==null) return null;
            //建立三个指针:pre,current,tmp
            ListNode reverseHead = null;
            ListNode pre = null;
            ListNode current = head;
            ListNode tmp = null;
            //当current不为null时开始循环
            while(current!=null){
                //用tmp保存current的下一个节点
                tmp = current.next;
                //当tmp为空时返回current
                if (tmp==null) reverseHead = current;
                //current指向pre
                current.next = pre;
                //pre移动到current位置
                pre=current;
                //current移动到tmp位置
                current = tmp;
            }
            return reverseHead;
        }
    }
}
