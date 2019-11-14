package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_225 {
    class MyStack {
        private Queue<Integer> queue;
        /** Initialize your data structure here. */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int size = queue.size();
            while (size!=1){
                queue.add(queue.poll());
                size--;
            }
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            int size = queue.size();
            while (size!=1){
                queue.add(queue.poll());
                size--;
            }
            int temp = queue.peek();
            queue.add(queue.poll());
            return temp;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
