public class Demo26 {
    /*给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。*/
    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead) {
            //找到相遇点
            ListNode meet1 = MeetingPoint(pHead);
            if (meet1==null) return null;
            int n = 1;
            //定义另一个指针向前走
            ListNode meet2 = meet1;
            //得到环的长度n
            while (meet2.next!=meet1){
                meet2 = meet2.next;
                n++;
            }
            //让节点一先走n步
            ListNode p1 = pHead;
            for (int i=0;i<n;i++){
                p1 = p1.next;
            }
            //节点一和二同时开始走直到相遇
            ListNode p2 = pHead;
            while (p2!=p1){
                p2 = p2.next;
                p1 = p1.next;
            }
            return p1;
        }

        //找到环中相遇节点
        public ListNode MeetingPoint(ListNode pHead) {
            if (pHead == null) return null;
            ListNode pSlow = pHead.next;
            if (pSlow == null) return null;
            ListNode pFast = pSlow.next;
            while (pSlow != null && pFast != null) {
                if (pSlow == pFast) {
                    return pSlow;
                }
                pSlow = pSlow.next;
                pFast = pFast.next;
                if (pFast != null) {
                    pFast = pFast.next;
                }
            }
            return null;
        }
    }
}
