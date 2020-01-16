import classes.TreeNode;

import java.util.ArrayList;

public class 面试题34 {
    public static class Solution {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            ArrayList<Integer> array = new ArrayList<>();
            FindPathCore(root,target,array);
            return result;
        }
        public void FindPathCore(TreeNode root, int target,ArrayList<Integer> array){
            if (root==null) return;
            array.add(root.val);
            int newTarget = target - root.val;
            if (newTarget==0&&root.left==null&&root.right==null){

                result.add(new ArrayList<>(array));
                //array.remove(array.size()-1);
                //return;
            }
            //if (newTarget<0) return;
            //array.add(root.val);
            if (root.left!=null) FindPathCore(root.left,newTarget,array);
            if (root.right!=null) FindPathCore(root.right,newTarget,array);
            array.remove(array.size()-1);
            return;
        }
    }
}

