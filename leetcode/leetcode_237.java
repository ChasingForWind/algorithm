package leetcode;

public class leetcode_237 {
    class Solution {
        public void deleteNode(ListNode node) {
            //将下一个值设为当前节点的值
            node.next.val = node.val;
            //当前节点指向下一个节点的下一个节点
            node.next = node.next.next;

        }
    }
}
