import classes.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class 面试题77 {
    /*之字形打印二叉树*/
    public class Solution {
        public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            //new返回数据类型
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            //注意鲁棒性
            if (pRoot==null) return res;
            //维护两个栈
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            //向奇数栈中添加节点
            s1.add(pRoot);
            //维护一个变量决定打印顺序
            int layer=1;
            //while大循环
            while (!s1.isEmpty()||!s2.isEmpty()){
                //进入奇数循环新建一个数轴集合
                if (layer%2==1){
                    ArrayList<Integer> array = new ArrayList<>();
                    while (!s1.isEmpty()){
                        TreeNode pop = s1.pop();
                        array.add(pop.val);
                        if (pop.left!=null) s2.add(pop.left);
                        if (pop.right!=null) s2.add(pop.right);

                    }
                    if (!array.isEmpty()){
                        res.add(array);
                        layer++;
                        continue;
                    }
                }
                //进入偶数数循环新建一个数轴集合
                if (layer%2==0){
                    ArrayList<Integer> array = new ArrayList<>();
                    while (!s2.isEmpty()){
                        TreeNode pop = s2.pop();
                        array.add(pop.val);
                        if (pop.right!=null) s1.add(pop.right);
                        if (pop.left!=null) s1.add(pop.left);
                    }
                    if (!array.isEmpty()){
                        res.add(array);
                        layer++;
                    }
                }
            }
            //返回结果
            return res;
        }
    }
}
