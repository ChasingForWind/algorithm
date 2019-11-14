package leetcode;

import java.util.*;

public class leetcode_133 {
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
        //维系一个队列和一个hashmap
        Queue<Node> queue = new LinkedList<Node>();
        HashMap<Integer, Node> map = new HashMap<>();
        Node head;

        public Node cloneGraph(Node node) {
            //将头结点放入queue中
            queue.add(node);
            //当队列不为空时
            while (!queue.isEmpty()) {
                //弹出头结点
                Node poll = queue.poll();
                Node Copy = null;
                //判断是否被new过
                //不被new过则new 放入hashmap
                //被new过则跳过
                if (!map.containsKey(poll.val)) {
                    Copy = new Node(poll.val, new ArrayList<Node>());
                    map.put(poll.val, Copy);
                }else{
                    Copy = map.get(poll.val);
                }
                //判断hashmap中个数，为1时锁定头结点
                if (map.size() == 1) head = poll;
                //得到node的所有邻居
                if (poll.neighbors != null) {
                    List<Node> neighbors = poll.neighbors;
                    //for循环
                    //判断是否在hashmap里
                    //如果在，则加入neighbor
                    //如果不在，,加入hashmap,则new之后加入neighbor
                    //加入queue
                    for (Node oldNode : neighbors) {
                        queue.add(oldNode);
                        if (!map.containsKey(oldNode.val)) {
                            Node nNode = new Node(oldNode.val, new ArrayList<Node>());
                            map.put(oldNode.val, nNode);
                            Copy.neighbors.add(nNode);
                        } else {
                            Copy.neighbors.add(map.get(oldNode.val));
                        }
                    }
                }
            }
            return head;
        }
    }
}
