package leetcode;

public class leetcode_104 {
    class Solution {
        public int maxDepth(TreeNode root) {

            if (root.left==null&&root.right==null){
                return 1;
            }

            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }

    }
}