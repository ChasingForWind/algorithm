import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 面试题54 {

    public class Solution {
        List<TreeNode> list = new ArrayList<>();
        TreeNode KthNode(TreeNode pRoot, int k)
        {
            if (pRoot==null||k==0) return null;
            KthNodeCore(pRoot);
            if (list.size()<k) return null;
            return list.get(k-1);
        }
        public void KthNodeCore(TreeNode pRoot){
            if (pRoot==null) return;
            KthNodeCore(pRoot.left);
            list.add(pRoot);
            KthNodeCore(pRoot.right);
        }
    }

}
