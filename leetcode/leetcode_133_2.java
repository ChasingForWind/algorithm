package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class leetcode_133_2 {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    class Solution {
        HashMap<Node,Node> map = new HashMap<>();
        public Node cloneGraph(Node node) {
            return dfs(node);
        }
        public Node dfs(Node node){
            if (node==null) return null;
            if (map.containsKey(node)) return map.get(node);
            Node clone = new Node(node.val,new ArrayList<>());
            map.put(node,clone);
            if (node.neighbors!=null){
                for (Node n:node.neighbors){
                    clone.neighbors.add(dfs(n));
                }
            }
            return clone;
        }
    }
}
