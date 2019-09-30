package leetcode;
/*617. Merge Two Binary Trees*/
public class test1 {
    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            //如果都为null返回null
            if(t1==null&&t2==null) return null;
            //说明t1和t2至少有一个不为null
            //新建一个节点
            //进行赋值
            if (t1==null) {
                return t2;
            }
            if (t2==null){
                return t1;
            }
            TreeNode treeNode = new TreeNode(t1.val + t2.val);
            //对节点的左子树递归
            treeNode.left = mergeTrees(t1.left,t2.left);
            //对节点的右子树递归
            treeNode.right = mergeTrees(t1.right,t2.right);
            //返回节点
            return treeNode;
        }
    }
}
