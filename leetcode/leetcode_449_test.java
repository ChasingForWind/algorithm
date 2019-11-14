package leetcode;

public class leetcode_449_test {
    private static String s= "";
    private static int index=0;
    public static void main(String[] args) {
        String[] s = {"2","1","3"};
        TreeNode head = TreeNodeBuilder.buildTree(s);
        TreePrint.printTree(head);
        String serialize = serialize(head);
        System.out.println(serialize);
        TreeNode deserialize = deserialize(serialize);
        TreePrint.printTree(deserialize);

    }

    public static String serialize(TreeNode root) {
        if (root == null)  return "#_";
        s = root.val+"_";
        s = s + serialize(root.left);
        s = s + serialize(root.right);
        return s;
    }
    public static TreeNode deserialize(String data) {
        String[] s = data.split("_");
        TreeNode head = helper(s);
        return head;
    }

    public static TreeNode helper(String[] s){
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
