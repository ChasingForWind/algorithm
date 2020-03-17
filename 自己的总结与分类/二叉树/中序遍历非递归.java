package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 中序遍历非递归 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            //创建返回结果
            ArrayList<Integer> res = new ArrayList<>();
            //代码鲁棒性
            if (root==null){
                return res;
            }
            //创建辅助栈
            Stack<TreeNode> stack = new Stack<>();
            //如果存在左孩子，就把左孩子扔进去
            while (root!=null||!stack.isEmpty()){
                while (root!=null){
                    stack.add(root);
                    root = root.left;
                }
                //出栈
                TreeNode pop = stack.pop();
                res.add(pop.val);
                //判断是否有左孩子，有的话处理左孩子
                if (pop.right!=null);
                root = pop.right;
            }
            return res;
        }
    }
}
