package leetcode;

public class leetcode_111 {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root==null) return 0;
            if (root.right==null&&root.left!=null) return minDepth(root.left);
            else if (root.left==null&&root.right!=null) return minDepth(root.right);
            else if (root.right==null&&root.left==null) return 1;
            else return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }
}
