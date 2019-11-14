package leetcode;


public class binaryTree {

    TreeNode root;

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int paraValue) {
            this.value = paraValue;
        }
    }

    public binaryTree(String[] array) {
        root = createBinaryTreeByArray(array, 0);
    }

    private TreeNode createBinaryTreeByArray(String[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            if (array[index]==null) return tn;
            int value = Integer.valueOf(array[index]);
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }
}