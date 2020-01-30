import classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 面试题66 {
    /*打印二叉树*/
    public class Solution {
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            //结果集
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if (pRoot==null) return res;
            //队列
            Queue<TreeNode> queue = new LinkedList<>();
            //提示这层的末尾
            TreeNode flag = pRoot;
            //加入
            if (queue.isEmpty()) queue.add(pRoot);
            //每一层的数字
            ArrayList<Integer> temp = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if (poll.left!=null) queue.add(poll.left);
                if (poll.right!=null) queue.add(poll.right);
                if (poll==flag){
                    if (poll.left!=null) flag = poll.left;
                    if (poll.right!=null) flag = poll.right;
                    res.add(temp);
                    //清空这个temp
                    temp = new ArrayList<Integer>();
                }
            }
            return res;
        }
    }
}
