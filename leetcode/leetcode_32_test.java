package leetcode;

import java.util.Stack;

public class leetcode_32_test {
    public static void main(String[] args) {
        String s = "(()";
        int i = longestValidParentheses(s);
        System.out.println(i);
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i=0;i<chars.length;i++){
            if ((!stack.isEmpty())&&(stack.peek()=='('&&chars[i]==')')){
                stack.pop();
                result=result+2;
            }
            else {
                stack.add(chars[i]);
            }
        }
        return result;
    }
}
