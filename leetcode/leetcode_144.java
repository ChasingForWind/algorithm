package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode_144 {
    class Solution {
        List<Integer> list =  new ArrayList<Integer>();
        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<Integer> stack = new Stack<>();
            help(root);
            return list;
        }
        public void help(TreeNode root){
            if (root==null) return;
            list.add(root.val);
            help(root.left);
            help(root.right);
        }
    }
}
