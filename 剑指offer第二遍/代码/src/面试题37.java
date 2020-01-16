import classes.TreeNode;



public class 面试题37 {
    //public Object Solution;

    public class Solution {
        StringBuilder sb = new StringBuilder();
        int i = -1;
        String Serialize(TreeNode root) {
           SerializeCore(root);
           sb.append("!");
           return sb.toString();
        }
        void SerializeCore(TreeNode root){
            if (root==null){
                sb.append("#,");
                return;
            }
            sb.append(root.val+",");
            SerializeCore(root.left);
            SerializeCore(root.right);
        }
        TreeNode Deserialize(String str) {
            if (str==null) return null;
            String[] split = str.split(",");
            return DeserializeCore(split);
        }
        TreeNode DeserializeCore(String[] string){
            i++;
            if (i>=string.length) return null;
            if (string[i].equals("#")) return null;
            TreeNode treeNode = new TreeNode(Integer.valueOf(string[i]));
            treeNode.left = DeserializeCore(string);
            treeNode.right = DeserializeCore(string);
            return treeNode;
        }
    }
}
