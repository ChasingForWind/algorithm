import classes.TreeNode;

import java.util.ArrayList;

public class 面试题7 {
    public class Solution {
        public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
            TreeNode root = rebuild(pre,0,pre.length-1,in,0,in.length-1);
            return root;
        }

        public TreeNode rebuild(int[] pre,int start_pre,int end_pre,int[] in,int start_in,int end_in){
            if (start_in>end_in||start_pre>end_pre) return null;
            TreeNode root = new TreeNode(pre[start_pre]);
            for (int i=start_in;i<=end_in;i++){
                if (in[i]==pre[start_pre]){
                    root.left = rebuild(pre,start_pre+1,start_pre+i-start_in,in,start_in,i-1);
                    root.right = rebuild(pre,start_pre+i-start_in+1,end_pre,in,i+1,end_in);
                    break;
                }

            }
            return root;
        }
    }
}
