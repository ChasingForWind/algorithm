package 算法lru实现;

import java.util.HashMap;

/*手写实现*/
public class demo1 {
    class Node {
        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String key = null;
        public String value = null;
        public Node pre;
        public Node next;
    }

    class LRUache {
        private Node head;
        private Node end;

        private int limit;

        public LRUache(int limit) {
            this.limit = limit;
            hashMap = new HashMap<String, Node>();
        }

        private HashMap<String, Node> hashMap;
        /**
         * 删除节点
         */
        private String removeNode(Node node){
            if(node == end){
                end = end.pre;
            }else if(node == head){
                head = head.next;
            }else{
                node.pre.next = node.next;
                node.next.pre = node.pre;
            }

            return node.key;
        }

        /**
         * 插入节点
         */
        private void addNode(Node node){
            if (end!=null){
                end.next = node;
                node.pre = end;
                node.next = null;
            }
            end = node;
            if(head==null){
                head = node;
            }
        }

        /**
         * 刷新被访问的节点
         */
        private void refreshNode(Node node){
            removeNode(node);
            addNode(node);
        }

        /**
         * 放置节点
         */
        public void put(String key,String value){
            Node node = hashMap.get(key);

            if(node==null){
                if(hashMap.size()>=limit) {
                    String oldKey = removeNode(head);
                    hashMap.remove(oldKey);
                }
                    node = new Node(key,value);
                    addNode(node);
                    hashMap.put(key,node);
            }else{
                node.value = value;
                refreshNode(node);
            }
        }
        /**
         * 获取节点
         */
        public String get(String key){
            Node node = hashMap.get(key);
            if (node==null) return null;
            else{
                refreshNode(node);
                return node.value;
            }
        }
    }
}
class LURMain{
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        算法lru实现.demo1.LRUache lrUache = demo1.new LRUache(5);
        lrUache.put("001","用户1信息");
        lrUache.put("002","用户2信息");
        lrUache.put("003","用户3信息");
        lrUache.put("004","用户4信息");
        lrUache.put("005","用户5信息");
        System.out.println(lrUache.get("002"));
        lrUache.put("004","用户2信息更新");
        lrUache.put("006","用户6信息");
        System.out.println(lrUache.get("001"));
    }
}
