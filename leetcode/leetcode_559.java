package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class leetcode_559 {
    class Solution {
        public int maxDepth(Node root) {
            if (root==null) return 0;
            if (root.children.isEmpty()) return 1;
            List<Integer> heights = new LinkedList<>();
            for (Node item:root.children){
                heights.add(maxDepth(item));
            }
            return Collections.max(heights)+1;
        }
    }
}
