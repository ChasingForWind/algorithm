import classes.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class 面试题6 {
    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> res = new ArrayList<>();
            while (listNode!=null){
                stack.add(listNode.val);
                listNode=listNode.next;
            }
            while (!stack.isEmpty()){
                res.add(stack.pop());
            }
            return res;
        }
    }
}
