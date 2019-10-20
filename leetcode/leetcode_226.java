package leetcode;

public class leetcode_226 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root.right==null ||root.left==null) return root;
            TreeNode temp = null;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.left);
            return root;
        }
    }
}
