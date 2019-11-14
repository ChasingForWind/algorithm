package leetcode;

public class TreeNodeBuilder {
    public static TreeNode buildTree(String[] strings){
        int index = 0;
        TreeNode head = helper(strings,index);
        return head;
    }

    public static TreeNode helper(String[] strings,int index){
        TreeNode head = null;
        if (index<strings.length) {
            if (strings[index] == null) return head;
            head = new TreeNode(Integer.valueOf(strings[index]));
            head.left = helper(strings, 2 * index + 1);
            head.right = helper(strings, index * 2 + 2);
            return head;
        }
        return head;
    }
}
