package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 后序遍历非递归 {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            //创建返回的数据结构
            ArrayList<Integer> res = new ArrayList<>();
            //代码的鲁棒性
            if (root == null) return res;
            //创建两个栈
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            //和前序遍历相同的过程不过是把弹出的数字放入第二个栈中
            stack1.push(root);
            while (!stack1.isEmpty()){
                TreeNode pop = stack1.pop();
                stack2.push(pop.val);
                if (pop.left!=null) stack1.push(pop.left);
                if (pop.right!=null) stack1.push(pop.right);
            }
            //从栈中弹出
            while (!stack2.isEmpty()){
                res.add(stack2.pop());
            }
            //返回数据结构
            return res;
        }
    }
}
