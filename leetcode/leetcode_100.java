package leetcode;

public class leetcode_100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p==null&&q!=null) return false;
            if (q==null&&p!=null) return false;
            if (p==null&&p==null) return true;
            if (p.val!=q.val) return false;
            boolean flag1 = isSameTree(p.left,q.left);
            boolean flag2 = isSameTree(p.right,q.right);
            return flag1&&flag2;
        }
    }
}
