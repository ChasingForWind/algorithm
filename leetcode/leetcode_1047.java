package leetcode;

import java.util.Stack;

public class leetcode_1047 {
    class Solution {
        public String removeDuplicates(String S) {
            Stack<Character> stack = new Stack<>();
            for (int i=0;i<S.length();i++){
                if (stack.isEmpty()){
                    stack.add(S.charAt(i));
                    continue;
                }
                if (stack.peek().equals(S.charAt(i))) {
                    stack.pop();
                    continue;
                }
                stack.add(S.charAt(i));
            }
            Stack<Character> stack2 = new Stack<>();
            while (!stack.isEmpty()){
                stack2.add(stack.pop());
            }
            StringBuilder sb = new StringBuilder();
            while (!stack2.isEmpty()){
                sb.append(stack2.pop());
            }
            return sb.toString();
        }
    }
}
