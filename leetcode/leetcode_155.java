package leetcode;

import java.util.Stack;

public class leetcode_155 {
    class MinStack {
        /** initialize your data structure here. */
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        public MinStack() {
        }

        public void push(int x) {
            stack1.push(x);
            if (stack2.isEmpty()) stack2.push(x);
            else {
                if (stack2.peek()<x){
                    stack2.push(stack2.peek());
                }else{
                    stack2.push(x);
                }
            }
        }

        public void pop() {
            if(!stack1.isEmpty()) stack1.pop();
            if(!stack2.isEmpty()) stack2.pop();
        }

        public int top() {
            if (!stack2.isEmpty()) stack2.pop();
            if (!stack1.isEmpty())
            return stack1.pop();
            else return 0;
        }

        public int getMin() {
            if (!stack2.isEmpty())
            return stack2.peek();
            throw new RuntimeException("非法");
        }
    }
}
