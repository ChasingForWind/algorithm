import java.util.Stack;

public class Demo29 {
    /*输入两个整数序列，第一个序列表示栈的压入顺序，
    请判断第二个序列是否可能为该栈的弹出顺序。
    假设压入栈的所有数字均不相等。
    例如序列1,2,3,4,5是某栈的压入顺序，
    序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
    但4,3,5,1,2就不可能是该压栈序列的弹出序列。
    （注意：这两个序列的长度是相等的）*/
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            //当pushA或者popA为null的时候返回null保持代码的鲁棒性
            if (pushA==null||popA==null) return false;
            //创建一个栈来模范整个过程
            Stack<Integer> s = new Stack<Integer>();
            int popIndex = 0;
            //用for循环表示一共进行pushA.length次
            for (int i=0;i<pushA.length;i++){
                s.push(pushA[i]);
                //栈顶相等则弹出
                while (!s.empty()&&s.peek()==popA[popIndex]){
                    s.pop();
                    popIndex++;
                }
            }
            //返回栈，如果for循环结束后栈为空则说明是弹出序列
            return s.empty();
        }
    }
}
