package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class leetcode_257 {
    class Solution {
        List<String> list = new ArrayList<String>();
        public List<String> binaryTreePaths(TreeNode root) {
            String s = "";
            helper(root,s);
            return list;
        }
        public void helper(TreeNode root,String s){
            if (root==null) return;
            if (root.left==null&&root.right==null){
                s = s + root.val;
                list.add(s);
            }
            s=s+root.val+"->";
            if (root.left!=null) helper(root.left,s);
            if (root.right!=null) helper(root.right,s);
        }
    }
}
