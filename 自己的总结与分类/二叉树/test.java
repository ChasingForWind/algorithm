package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    //层序遍历二叉树
public ArrayList<ArrayList<Integer>> getCount(TreeNode root){
        //定义返回数据类型
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //代码的鲁棒性
        if(root==null) return res;
        //定义队列、变量
        int total = 1;
        int size = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        queue.add(root);
        //while循环
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            size++;
            array.add(temp.val);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            if(size==total){
                res.add(array);
                array = new ArrayList<>();
                total = queue.size();
            }
        }
        //返回
        return res;
    }

    //定义一个函数将数组转换成数字
    public int toNumber(ArrayList<Integer> array){
        int result = 0;
        int size = array.size();
        int i = 0;
        while(i<size){
            result = result*10 + array.get(i);
        }
        return result;
    }

    //数字相加
    public int Main(TreeNode root){
        if(root==null) return 0;
        ArrayList<ArrayList<Integer>> res = getCount(root);
        int result = 0;
        for(int i=0;i<res.size();i++){
            result = result+toNumber(res.get(i));
        }
        return result;
    }

}
