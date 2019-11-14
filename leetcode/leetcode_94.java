package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            help(list,root);
            return list;
        }
        public void help(List<Integer> list,TreeNode root){
            if (root==null) return;
            help(list,root.left);
            list.add(root.val);
            help(list,root.right);
        }
    }
}
