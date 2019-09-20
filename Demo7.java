public class Demo7 {
    public class Solution {
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
            return root;
        }
        private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startin,int endIn){
            if(startPre>endPre||startin>endIn){
                return null;
            }
            TreeNode root = new TreeNode(pre[startPre]);
            for(int i=0;i<in.length;i++){
                if(in[i]==pre[startPre]){
                    root.left = reConstructBinaryTree(pre,startPre+1,startPre+i-startin,in,startin,i-1);
                    root.right= reConstructBinaryTree(pre,startPre+i-startin+1,endPre,in,i+1,endIn);
                    break;
                }
            }
            return root;
        }
    }
}
