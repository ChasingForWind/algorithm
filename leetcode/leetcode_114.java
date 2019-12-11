package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_114 {
    class Solution {
        Queue<Integer> queue = new LinkedList<>();
        public void flatten(TreeNode root) {
            if(root==null) return;
            buildQueue(root);
            root.left = null;
            root.right = null;
            TreeNode tree = root;
            queue.poll();
            while (!queue.isEmpty()){
                TreeNode temp = new TreeNode(queue.poll());
                tree.right = temp;
                tree = temp;
            }
        }
        public void buildQueue(TreeNode root){
            if (root==null){
                return;
            }
            queue.add(root.val);
            buildQueue(root.left);
            buildQueue(root.right);
        }
    }   
}
