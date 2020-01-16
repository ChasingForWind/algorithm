import classes.TreeLinkNode;

public class 面试题8 {
    public class Solution {
        public TreeLinkNode GetNext(TreeLinkNode pNode)
        {
            if (pNode==null) return null;
            //存在右子树，用getLeftSon的办法取得返回值
            if (pNode.right!=null) return getLeftSon(pNode.right);
            //不存在右子树，就返回第一个是其父的左子树的节点
            else return getFather(pNode.next);
        }
        public TreeLinkNode getLeftSon(TreeLinkNode pNode){
            if (pNode.left==null) return pNode;
            else return getLeftSon(pNode.left);
        }

        public TreeLinkNode getFather(TreeLinkNode pNode){
            if (pNode==null||pNode.next==null) return null;
            if (pNode==pNode.next.left) return pNode.next;
            return getFather(pNode.next);
        }
    }
}
