import java.util.ArrayList;

public class Demo42 {

    public class Solution {
        //不要想得太复杂，直接递归即可
        boolean isSymmetrical(TreeNode pRoot)
        {
            return isSymmetrical(pRoot,pRoot);
        }
        boolean isSymmetrical(TreeNode p1,TreeNode p2){
            //如果两个都为null，返回true
            if (p1==null&p2==null) return true;
            //如果一个为null，一个不为null，返回false
            if (p1==null||p2==null) return false;
            //如果都不为null则比较他们的值是否相等
            if (p1.val !=p2.val) return false;
            //继续递归
            return isSymmetrical(p1.left,p2.right)&&isSymmetrical(p1.right,p2.left);
        }
    }

}
