package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_637 {
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            ArrayList<Double> res = new ArrayList<>();
            TreeNode end = root;
            TreeNode next = root;
            queue.add(root);
            ArrayList<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode temp = queue.poll();
                list.add(temp.val);

                if (temp.left!=null) {
                    queue.add(temp.left);
                    next = temp.left;
                }
                if (temp.right!=null) {
                    queue.add(temp.right);
                    next = temp.right;
                }
                if (temp == end){
                    Double sum = 0.0;
                    for (int i=0;i<list.size();i++){
                        sum+=list.get(i);
                    }
                    res.add(sum/list.size());
                    list = new ArrayList<Integer>();
                    end = next;
                }
            }
            return res;
        }
    }
}
