import classes.TreeNode;

public class 面试题56_后序遍历 {
    public class Solution {
        boolean isBalance = true;

        public boolean IsBalanced_Solution(TreeNode root) {
            getDepth(root);
            return isBalance;
        }
        public int getDepth(TreeNode root){
            if (root==null) return 0;
            int left = getDepth(root.left);
            int right = getDepth(root.right);
            if (Math.abs(left-right)>1) isBalance=false;
            return 1+Math.max(left,right);
        }
    }
}
