import classes.TreeNode;

public class 面试题55 {
    public class Solution {
        public int TreeDepth(TreeNode root) {
            if (root==null) return 0;
            return TreeDepthCore(root);
        }

        public int TreeDepthCore(TreeNode root){
            if (root.right==null&&root.left==null) return 1;
            int left = TreeDepthCore(root.left);
            int right = TreeDepthCore(root.right);
            return 1+Math.max(left,right);
        }
    }
}
