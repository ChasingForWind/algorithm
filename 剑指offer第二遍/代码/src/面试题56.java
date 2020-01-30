import classes.TreeNode;

public class 面试题56 {
    public class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if (root==null) return true;
            int left = getDepth(root.left);
            int right = getDepth(root.right);
            if (Math.abs(left-right)>1) return false;
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        }
        public int getDepth(TreeNode root){
            if (root==null) return 0;
            return 1+Math.max(getDepth(root.right),getDepth(root.left));
        }
    }
}
