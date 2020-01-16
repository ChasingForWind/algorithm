import classes.TreeNode;

public class 面试题26 {
    public class Solution {
        public boolean HasSubtree(TreeNode root1, TreeNode root2) {
           //首先找到根节点相同的点
            boolean result = false;
            if (root1!=null&&root2!=null) {
                //如果两者根节点相同则调用函数进行比较
                if (root1.val==root2.val) result = help(root1,root2);
                //如果不相同则继续找
                if (!result) result = HasSubtree(root1.left,root2);
                if (!result) result = HasSubtree(root1.right,root2);
            }
            return result;
        }

        public boolean help(TreeNode roo1, TreeNode root2) {
            //在根节点相同的条件下
            if (root2==null) return true;
            if (roo1==null) return false;
            if (roo1.val!=root2.val) return false;
            else return help(roo1.left,root2.left)&&help(roo1.right,root2.right);
        }
    }
}
