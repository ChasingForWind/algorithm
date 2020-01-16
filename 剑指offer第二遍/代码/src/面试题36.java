import classes.TreeNode;

public class 面试题36 {
    public class Solution {
        TreeNode tail = null;
        TreeNode head = null;
        public TreeNode Convert(TreeNode pRootOfTree) {
            ConvertCore(pRootOfTree);
            return head;
        }

        public void ConvertCore(TreeNode root){
            if (root==null) return;
            ConvertCore(root.left);
            if (head==null){
                tail=root;
                head=root;
            }else {
                tail.right = root;
                root.left = tail;
                tail = root;
            }
            ConvertCore(root.right);
        }
    }
}
