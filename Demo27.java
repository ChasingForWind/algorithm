public class Demo27 {
    /*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/
    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            boolean result = false;
            if (root1!=null&&root2!=null){
                if (root1.val==root2.val){
                    result = SameStructure(root1,root2);
                }
                if (!result) result = HasSubtree(root1.left,root2);
                if (!result) result = HasSubtree(root2.right,root2);
            }
            return result;
        }
        //当节点相同时递归寻找结构是否也相同
        public boolean SameStructure(TreeNode pRoot1,TreeNode pRoot2){
            //当pRoot2没有不存在时返回true
            if (pRoot2==null){
                return true;
            }
            //pRoot2存在但pRoot1没有子节点时返回false
            if (pRoot1==null){
                return false;
            }
            //比较节点的值
            if (pRoot2.val!=pRoot1.val){
                return false;
            }
            //进行左右递归
            return SameStructure(pRoot1.left,pRoot2.left)&&SameStructure(pRoot1.right,pRoot2.right);
        }
    }

}
