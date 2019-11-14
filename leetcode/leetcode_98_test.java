package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_98_test {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        String[] s = {"5","1","4",null,null,"3","6"};
        TreeNode head = TreeNodeBuilder.buildTree(s);
        isValidBST(head);
    }

    public static boolean isValidBST(TreeNode root) {
        helper(root);
        int size = queue.size();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = queue.poll();
        }
        for (int i = 0; i < size-1; i++) {
            if (A[i] >= A[i + 1]) return false;
        }
        return true;
    }

    public static void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        queue.offer(root.val);
        helper(root.right);
    }
}
