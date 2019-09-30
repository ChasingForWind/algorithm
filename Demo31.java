import java.util.ArrayList;
import java.util.LinkedList;

public class Demo31 {
    /*从上往下打印出二叉树的每个节点，同层节点从左至右打印。*/
    public class Solution {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

            //新建队列
            ArrayList<Integer> list = new ArrayList<Integer>();
            LinkedList<TreeNode> treeNodes = new LinkedList<TreeNode>();
            //保持代码的鲁棒性
            if (root==null) return list;
            //向队列中放入第一个节点
            treeNodes.add(root);
            while (!treeNodes.isEmpty()){
                //弹出第一个数字
                TreeNode remove = treeNodes.remove(0);
                //将这个数字的左右子树存入treeNode
                if (remove.left!=null) treeNodes.add(remove.left);
                if (remove.right!=null) treeNodes.add(remove.right);
                //将弹出的树的值存入队列中
                list.add(remove.val);
            }
            return list;

        }
    }
}
