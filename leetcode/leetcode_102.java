package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            //判断是否是空
            if (root==null) return null;
            //定义end 表示当前层的最后一个节点
            TreeNode end = root;
            //定义next 表示下一层的最后一个节点
            TreeNode next = null;
            //定义一个队列
            Queue<TreeNode> queue = new LinkedList<>();
            //定义一个大数组和一个小数组
            List<List<Integer>> big = new LinkedList<>();
            List<Integer> small = new LinkedList<>();
            //开始将头节点入队
            queue.offer(root);
            //判断队列是否为空进行while循环
            while (!queue.isEmpty()){
                //出队
                TreeNode temp = queue.poll();
                small.add(temp.val);
                //其子节点入队
                //入队子节点设为next
                if (temp.left!=null){
                    queue.offer(temp.left);
                    next=temp.left;
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                    next=temp.right;
                }
                //判断是否是end节点，如果是则将end设为next，next设为null,并且将数组放入大数组，将原数组清空
                if (temp==end){
                    end = next;
                    next=null;
                    LinkedList<Integer> tempList = new LinkedList<>();
                    for (int i=0;i<small.size();i++){
                        tempList.add(small.get(i));
                    }
                    big.add(tempList);
                    small.clear();
                }
            }
            return big;
        }
    }
}
