package leetcode;

public class leetcode_449 {
    public class Codec {
        // Encodes a tree to a single string.
        String s= "";
        int index = 0;
        public String serialize(TreeNode root) {
            if (root == null)  return "#_";
            s = root.val+"_";
            s = s + serialize(root.left);
            s = s + serialize(root.right);
            return s;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] s = data.split("_");
            TreeNode head = helper(s);
            return head;
        }
        public TreeNode helper(String[] s){
            TreeNode head = null;
            if(index<s.length){
                if (s[index].equals("#")) {
                    index++;
                    return null;
                }
                head = new TreeNode(Integer.valueOf(s[index]));
                index++;
                head.left = helper(s);
                head.right = helper(s);
                return head;
            }
            return head;
        }
    }
}
