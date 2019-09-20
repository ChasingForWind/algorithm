public class Demo8 {
    public class Solution {
        public TreeLinkNode GetNext(TreeLinkNode pNode) {
            //如果有右子树，则找到右子树的最左节点
            if (pNode.right != null) {
                pNode = pNode.right;
                while (pNode.left != null) {
                    pNode = pNode.left;
                }
                return pNode;
            }
            //如果没有右子树

            while (pNode.next != null) {
                //先观察其是否是父节点的左子树，如果是就返回父节点
                if (pNode == pNode.next.left) {
                    return pNode.next;
                }
                //如果不是则向上继续查找
                pNode = pNode.next;
            }
            return null;
        }
    }
}
