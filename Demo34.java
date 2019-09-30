import java.util.Stack;
public class Demo34 {
    /*定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。*/


    public class Solution {

        //定义一个常规栈和一个辅助栈
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> support = new Stack<Integer>();
        public void push(int node) {
            //正常栈正常push
            s.push(node);

            //辅助栈第判断栈是否为空
            if (support.size()==0) support.push(node);
            //如果为空，就直接push，如果不是空就和栈顶比较后决定push
            else{
                if (node<support.peek()){
                    support.push(node);
                }else{
                    support.push(support.peek());
                }
            }
        }

        public void pop() {
            //正常栈正常pop
            s.pop();
            //辅助栈正常pop
            support.pop();
        }

        public int top() {
            //正常栈正常top
            int num = s.peek();
            //辅助栈正常top
            int num2 = s.peek();
            return num;
        }

        public int min() {
            //辅助栈返回栈顶
            return support.peek();
            // 返回栈顶
        }
    }
}
