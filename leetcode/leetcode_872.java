package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_872 {
    class Solution {
        private List<Integer> list1 = new ArrayList<>();
        private List<Integer> list2 = new ArrayList<>();
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            helper(root1,list1);
            helper(root2,list2);
            Boolean flag = true;
            if (list1.size()!=list2.size()){
                flag = false;
                return flag;
            }
            for (int i=0;i<list1.size();i++){
                if (list1.get(i)!=list2.get(i)){
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
        public void helper(TreeNode root,List<Integer> list){
            if (root==null) return;
            if (root.right==null&root.left==null) {
                list.add(root.val);
            }
            helper(root.left,list);
            helper(root.right,list);
        }
    }
}
