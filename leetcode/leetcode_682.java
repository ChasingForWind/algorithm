package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class leetcode_682 {
    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < ops.length; i++) {
                switch (ops[i]) {
                    case "C":
                        stack.pop();
                        break;
                    case "+":
                        int temp = stack.pop();
                        int temp2 = stack.peek();
                        int temp3 = temp + temp2;
                        stack.push(temp);
                        stack.push(temp3);
                        break;
                    case "D":
                        int temp4 = stack.peek();
                        stack.push(temp4 * 2);
                        break;
                    default:
                        stack.push(Integer.valueOf(ops[i]));
                        break;
                }
            }
            int count = 0;
            while (!stack.isEmpty()) {
                count = count + stack.pop();
            }
            return count;
        }
    }
}
