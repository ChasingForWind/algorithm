public class Demo30 {
    /*操作给定的二叉树，将其变换为源二叉树的镜像。*/
    public class Solution {
        public void Mirror(TreeNode root) {
            //代码鲁棒性
            if(root==null) return;
            //递归出口
            if (root.left==null&&root.right==null) return;
             //递归函数
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            //执行递归
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
