package leetcode;

public class leetcode_965 {
    class Solution {
        public boolean isUnivalTree(TreeNode root) {
            int num = root.val;
            return help(num,root);
        }

        public boolean help(int num,TreeNode root){
            if (root==null) return true;
            if (root.val!=num) return false;
            return help(num,root.left)&&help(num,root.right);
        }
    }
}
