package 二叉树.二叉搜索树;


/*简单的实现一个二叉查找树*/
public class BinarySearchTree<Integer> {
    public BinarySearchTree left;
    public BinarySearchTree right;
    public int val;
    public BinarySearchTree(int val){this.val = val;}

    public BinarySearchTree insert(BinarySearchTree root,int val){
        if(root==null){
            return new BinarySearchTree(val);
        }
        if(val<root.val){
            root.left = insert(root,val);
        }else if(val>root.val){
            root.right = insert(root,val);
        }else {
            ;
        }
        return root;
    }

}
