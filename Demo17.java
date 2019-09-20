public class Demo17 {
    /*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    例如，链表1->2->3->3->4->4->5 处理后为 1->2->5*/
    public class Solution {
        public ListNode deleteDuplication(ListNode pHead) {
            //当空节点时返回
            if (pHead == null) {
                return null;
            }
            //在链表前面建立一个空节点指向链表头
            ListNode before = new ListNode(0);
            before.next = pHead;
            //建立pre指针和p指针
            ListNode pre = before;
            ListNode p = pHead;
            //进行循环
            while (p!=null){
                //当遇到p.val==p.next的时候
                if(p.next!=null&&p.val==p.next.val){
                    //创建内存存储值
                    int val = p.val;
                    while (p!=null&&val==p.val){
                        p = p.next;
                    }
                    //进行比较直到p.val!=p.next
                    //p指针向后移动一位
                    //pre指针指向p
                    pre.next = p;

                }else {
                    p=p.next;
                    pre = pre.next;
                }
            }
            return before.next;
        }
    }
}
