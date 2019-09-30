public class Demo39 {
    /*输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    要求不能创建任何新的结点，只能调整树中结点指针的指向。*/

    public class Solution {
        public TreeNode Convert(TreeNode pRootOfTree) {
            //保证代码的鲁棒性
            if (pRootOfTree==null) return null;
            //定义递归出口
            if (pRootOfTree.left==null&&pRootOfTree.right==null) return pRootOfTree;
            //递归将左子树构成双向链表返回表头节点
            TreeNode left = Convert(pRootOfTree.left);
            //定位至左子树双向链表的最后一个节点
            TreeNode p = left;
            while (p!=null&&p.right!=null){
                p=p.right;
            }
            //改变指针的值
            if (p!=null){
                p.right=pRootOfTree;
                pRootOfTree.left=p;
            }

            //递归将右子树构成双向链表返回表头节点
            TreeNode right = Convert(pRootOfTree.right);
            //直接将root定位到右子树的表头节点
            if (right!=null){
                pRootOfTree.right=right;
                right.left = pRootOfTree;
            }
            return left!=null?left:pRootOfTree;
        }
    }
}
