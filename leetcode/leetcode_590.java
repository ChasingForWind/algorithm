/*package leetcode;

import java.util.LinkedList;
import java.util.List;

public class leetcode_590 {
    class Solution {
        LinkedList<Integer> list = new LinkedList<>();
        public List<Integer> postorder(Node root) {
            findPostOrder(root);
            return list;
        }

        public void findPostOrder(Node root) {
            //终止条件
            if (root == null) {
                return;
            }
            for (int i = 0; i < root.children.size(); i++) {
                findPostOrder(root.children.get(i));
            }
            list.add(root.val);
        }
    }
}*/
