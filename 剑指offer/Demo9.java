import java.util.Stack;

public class Demo9 {
    public class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            //直接加入stack1
            stack1.push(node);
        }

        public int pop() {
            //如果stack2等于空
            //将stack1的所有元素放到stack2中
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    Integer p = stack1.pop();
                    stack2.push(p);
                }
                //从stack2中弹出顶部元素
                return stack2.pop();
            }
            //如果stack2不为空
            return stack2.pop();

        }
    }
}
