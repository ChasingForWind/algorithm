import classes.TreeNode;

public class 面试题28 {
    public class Solution {
        boolean isSymmetrical(TreeNode pRoot){
            return Help(pRoot,pRoot);
        }
        public boolean Help(TreeNode p, TreeNode root){
            if (p==null&&root==null) return true;
            if (p==null||root==null) return false;
            if (p.val!=root.val) return false;
            else return Help(p.right,root.left)&&Help(p.left,root.right);
        }
    }
    /*{
            if (pRoot==null) return false;
            //TreeNode p = pRoot;
            //建立一个和原来树结构相同的树
            TreeNode p = Clnoe(pRoot);
            Mirror(pRoot);
            //建立一个比较函数
            return Compara(p,pRoot);
        }
        public boolean Compara(TreeNode p, TreeNode root){
            if (p==null&&root==null) return true;
            if (p==null||root==null) return false;
            if (p.val!=root.val) return false;
            else return Compara(p.left,root.left)&&Compara(p.right,root.right);
        }

        public TreeNode Clnoe(TreeNode root){
            TreeNode p = root;
            if (root.left!=null) p.left=Clnoe(root.left);
            if (root.right!=null) p.right=Clnoe(root.right);
            return p;
        }
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
        }*/
}
