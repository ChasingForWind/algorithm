package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_897 {
    class Solution {
        Queue<Integer> queue = new LinkedList<>();
        public TreeNode increasingBST(TreeNode root) {
            midTraver(root);
            Object[] toArray = queue.toArray();
            TreeNode head = buidTree(toArray,0);
            return head;
        }
        public void midTraver(TreeNode root){
            if (root==null) return;
            midTraver(root.left);
            queue.add(root.val);
            midTraver(root.right);
        }
        public TreeNode buidTree(Object[] toArray,int num){
            if (num>=toArray.length) return null;
            TreeNode head = new TreeNode((Integer)toArray[num]);
            head.right = buidTree(toArray,num+1);
            return head;
        }
    }
}
