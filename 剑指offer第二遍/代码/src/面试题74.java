import classes.ListNode;

public class 面试题74 {
   /*删除链表中重复节点*/
   public class Solution {
       public ListNode deleteDuplication(ListNode pHead)
       {
           if (pHead==null) return null;
           if (pHead.next==null) return pHead;
           ListNode pre = new ListNode(-1);
           ListNode temp = pre;
           temp.next = pHead;
           pre.next = pHead;
           ListNode index = pHead;
           while (index!=null&&index.next!=null){
               ListNode next = index.next;
               if (next.val == index.val){
                   while (next!=null&&next.val==index.val){
                       next=next.next;
                   }
                   pre.next = next;
                   index = next;
               }else {
                   pre = index;
                   index = index.next;
               }
           }
           return temp.next;
       }
   }
}
