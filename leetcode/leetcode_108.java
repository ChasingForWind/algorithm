package leetcode;

public class leetcode_108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sorrtedArrayToBST(nums,0,nums.length-1);
        }
        public TreeNode sorrtedArrayToBST(int[] num,int left,int right){
           if (left>right) return null;
            int mid = left + (right-left)>>1;
            TreeNode treeNode = new TreeNode(num[mid]);
            treeNode.left = sorrtedArrayToBST(num,left,mid-1);
            treeNode.right = sorrtedArrayToBST(num,mid+1,right);
            return treeNode;
        }
    }
}
