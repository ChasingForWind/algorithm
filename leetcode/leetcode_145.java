package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_145 {
    class Solution {
        List<Integer> list = new ArrayList<Integer>();
        public List<Integer> postorderTraversal(TreeNode root) {
            help(root);
            return list;
        }
        public void help(TreeNode root){
            if (root==null) return;
            help(root.left);
            help(root.right);
            list.add(root.val);
        }
    }
}
