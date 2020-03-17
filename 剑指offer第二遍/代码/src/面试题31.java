import java.util.ArrayList;
import java.util.Stack;

public class 面试题31 {
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            if(pushA.length <= 0 || popA.length <= 0) return false;

            Stack<Integer> s = new Stack<>();
            int index = 0;
            for (int i = 0; i < pushA.length; i++) {
                s.add(pushA[i]);

                while (!s.isEmpty()&&s.peek()==popA[index]){
                    s.pop();
                    index++;
                }
            }
            return s.isEmpty();
        }
    }
}
