package leetcode;

public class leetcode_160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA;
            ListNode tempB = headB;
            int countA = 0;
            int countB = 0;
            if (tempA == null || tempB == null) return null;
            while (tempA != null && tempA.next != null) {
                tempA = tempA.next;
                countA++;
            }
            while (tempB != null && tempB.next != null) {
                tempB = tempB.next;
                countB++;
            }
            if (tempA != tempB) return null;
            int a = Math.abs(countA-countB);
            if (countA>countB){
                while (a!=0){
                    headA = headA.next;
                    a--;
                }
                while (headA!=headB){
                    headA = headA.next;
                    headB = headB.next;
                }
                return headA;
            }else{
                while (a!=0){
                    headB= headB.next;
                    a--;
                }
                while (headA!=headB){
                    headA = headA.next;
                    headB = headB.next;
                }
                return headA;
            }

        }
    }
}
