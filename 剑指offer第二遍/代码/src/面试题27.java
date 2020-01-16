import classes.TreeNode;

public class 面试题27 {
    public class Solution {
        public void Mirror(TreeNode root) {
            if (root==null) return;
            //遍历二叉树
            Change(root);
            if (root.left!=null) Mirror(root.left);
            if (root.right!=null) Mirror(root.right);
        }
        //定义一个函数可以交换一个节点的左右两个子节点
        public void Change(TreeNode root){
            if (root.left==null&&root.right==null){
                return;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}
