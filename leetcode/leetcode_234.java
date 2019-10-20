package leetcode;

import java.util.Stack;

public class leetcode_234 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            //申请一个栈
            Stack<Integer> stack = new Stack<>();
            ListNode help = head;
            //把所有的数放到栈里去
            while (help != null) {
                stack.add(help.val);
                help = help.next;
            }
            //再遍历一次从栈中拿出来比较
            boolean result = true;
            while (head != null) {
                if (head.val != stack.pop()) {
                    result = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            return result;
        }
    }
}
