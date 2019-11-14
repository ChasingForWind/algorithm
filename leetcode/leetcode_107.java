package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_107 {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            LinkedList<List<Integer>> result = new LinkedList<>();
            if (root==null) return result;
            //定义一个队列
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                //此时队列的长度就是这层的个数
                int count = queue.size();
                List<Integer> small = new LinkedList<>();
                for (int i = 0; i < count; i++) {
                    TreeNode temp = queue.poll();
                    small.add(temp.val);
                    if (temp.left!=null){
                        queue.add(temp.left);
                    }
                    if (temp.right!=null){
                        queue.add(temp.right);
                    }
                }
                result.addFirst(small);
            }
            return result;
        }
    }
}
