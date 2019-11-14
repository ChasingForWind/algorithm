package leetcode;

public class leetcode_222 {
    class Solution {
        public int countNodes(TreeNode root) {
            if(root==null) return 0;
            int left = findLevel(root.left);
            int right = findLevel(root.right);
            if (left==right) return countNodes(root.right)+(1<<left);
            else return countNodes(root.left)+(1<<right);
        }
        public int findLevel(TreeNode root){
            int count=0;
            while (root!=null){
                count++;
                root = root.left;
            }
            return count;
        }
    }
}
