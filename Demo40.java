public class Demo40 {
    /*请实现两个函数，分别用来序列化和反序列化二叉树
      二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
      从而使得内存中建立起来的二叉树可以持久保存。
      序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），
      以 ！ 表示一个结点值的结束（value!）
      二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
*/
    public class Solution {
        private int index = -1;
        String Serialize(TreeNode root) {
            //创建stringbuffer
            StringBuilder sb = new StringBuilder();
            //当遇到空节点时，返回以string方式的"#,"
            if (root==null){
                sb.append("#!");
                return sb.toString();
            }
            //如果不是空节点则进行拼接
            sb.append(root.val+"!");
            //递归左右子树
            sb.append(Serialize(root.left));
            sb.append(Serialize(root.right));
            return sb.toString();
        }
        TreeNode Deserialize(String str) {
            //计数指针加一
            index++;
            //将字符串分解成字符数组
            String[] split = str.split("!");
            //如果不为"#"
            TreeNode root = null;
            if (!split[index].equals("#")){
                //创建根节点
                root = new TreeNode(Integer.valueOf(split[index]));
                //创建根的左节点
                root.left = Deserialize(str);
                //创建根的右节点
                root.right = Deserialize(str);
                //返回根节点

            }
            return null;
        }
    }
}
