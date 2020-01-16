import classes.TreeNode;

public class 细节测试代码 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(6);

        面试题37 test = new 面试题37();
        面试题37.Solution solution = test.new Solution();
        String serialize = solution.Serialize(treeNode);
        System.out.println(serialize);
        solution.Deserialize(serialize);


    }
}
