package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_98 {
    class Solution {
        Queue<Integer> queue = new LinkedList<>();

        public boolean isValidBST(TreeNode root) {
            helper(root);
            int size = queue.size();
            int[] A = new int[size];
            for (int i = 0; i < size; i++) {
                A[i] = queue.poll();
            }
            for (int i = 0; i < size- 1; i++) {
                if (A[i] >= A[i + 1]) return false;
            }
            return true;
        }
        public void helper(TreeNode root) {
            if (root == null) return;
            helper(root.left);
            queue.offer(root.val);
            helper(root.right);
        }
    }
}
