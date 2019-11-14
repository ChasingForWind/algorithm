package leetcode;

import java.util.*;

public class leetcode_429 {
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            Queue<Node> queue = new LinkedList<>();
            Node end = root;
            Node next=null;
            ArrayList<List<Integer>> lists = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            if (root==null) return lists;
            queue.add(root);
            while (!queue.isEmpty()){
                Node temp = queue.poll();
                if (temp.children!=null){
                    for (int i =0;i<temp.children.size();i++){
                        queue.add(temp.children.get(i));
                        next = temp.children.get(i);
                    }
                }
                list.add(temp.val);
                if (temp==end){
                    lists.add(list);
                    end = next;
                    list = new ArrayList<>();
                }
            }
            return lists;
        }
    }
}
