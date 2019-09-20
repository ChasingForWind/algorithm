import java.util.ArrayList;
public class Demo41 {
    /**
     输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
     */
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            //新建一个总的lists
            ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
            //代码鲁棒性 root ==null
            if (root==null) return paths;
            //进入递归 参数： root target lists list
            find(root,target,paths,new ArrayList<Integer>());
            return paths;
        }
        //递归函数
        public void find(TreeNode root,int target,ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path){
            //首先在list中加入节点
            path.add(root.val);
            //判断是否是叶节点，如果是叶节点就判断target是否等于叶节点的值
            if (root.right==null&&root.left==null) {
                //如果相等则这条路加入其中
                if (target==root.val) {
                    paths.add(path);
                }
                //如果不相等则放弃这条路
                return;
            }
            //新建另一条路，复制之前的路径
            ArrayList<Integer> path2 = new ArrayList<Integer>();
            path2.addAll(path);
            //进行左节点递归
            if (root.left!=null)
            find(root.left,target-root.val,paths,path);
            //进行右节点递归
            if (root.right!=null)
            find(root.right,target-root.val,paths,path2);
        }
    }
}
