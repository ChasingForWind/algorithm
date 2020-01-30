import classes.ListNode;

public class 面试题74_递归版 {
    public class Solution {
        public ListNode deleteDuplication(ListNode pHead)
        {
            if(pHead==null||pHead.next==null) return pHead;
            if (pHead.val!=pHead.next.val){
                //保留当前节点从下一节点开始递归
                pHead.next = deleteDuplication(pHead.next);
                return pHead;
            }else {
                int val = pHead.next.val;
                while (val==pHead.val){
                    pHead=pHead.next;
                    //if (pHead==null) return null;
                }
                //跳过所有节点后从第一个与当前节点不相同的节点开始递归
                return deleteDuplication(pHead);
            }
        }
    }
}
