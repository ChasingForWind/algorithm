package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 前序非递归 {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            //创建一个辅助栈
            Stack<TreeNode> stack = new Stack<>();
            //创建返回结果数据结构
            List<Integer> res = new ArrayList<>();
            //保证代码鲁棒性
            if (root==null) return res;
            //判断栈是否为空，为空就添加
            if (stack.isEmpty()) stack.add(root);
            while (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                //出栈然后加入左右节点
                res.add(pop.val);
                if (pop.right!=null) stack.add(pop.right);
                if (pop.left!=null) stack.add(pop.left);
            }
            //返回结果
            return res;
        }
    }
}
