import classes.ListNode;

import java.util.ArrayList;
public class 面试题6_解法2 {
    /*使用递归的方法求解*/
    public class Solution {
        ArrayList<Integer> res = new ArrayList<>();
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            getResult(listNode);
            return res;
        }
        public void getResult(ListNode listNode){
            if (listNode==null){
                return;
            }
            getResult(listNode.next);
            res.add(listNode.val);
        }
    }
}
