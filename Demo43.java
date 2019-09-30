public class Demo43 {
    /*输入一棵二叉树，判断该二叉树是否是平衡二叉树。*/
    public class Solution {
        boolean result = true;
        public boolean IsBalanced_Solution(TreeNode root) {
            //调用递归函数
            getDepth(root);
            //返回
            return result;
        }
        //递归函数
        int getDepth(TreeNode root){
            //代码鲁棒性
            if (root==null) return 0;
            //获取左节点深度
            int left = getDepth(root.left);
            //获取右节点深度
            int right = getDepth(root.right);
            //相减判断是否大于1如果大于1则返回false
            if (Math.abs(left-right)>1) result=false;
            //返回深度
            return right > left ? right+1:left+1;
        }
    }
}
