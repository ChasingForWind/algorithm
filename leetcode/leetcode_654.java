package leetcode;

public class leetcode_654 {
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            //树的问题一般都要调用递归
            return helper(nums,0,nums.length-1);
        }
    }
        //递归分治
    public TreeNode helper(int[] nums, int l, int r) {
        if (l<=r) {
            int t = getMax(nums,l,r);
            TreeNode root = new TreeNode(nums[t]);
            root.left = helper(nums,l,t-1);
            root.right = helper(nums,t+1,r);
            return root;
        }else{
            return null;
        }
    }

    //获取最大值
    public int getMax(int[] num,int l,int r){
        int max = num[l];
        int result = l;
        for (int i = l;i<=r;i++){
            if (num[i]>max){
                max = num[i];
                result = i;
            }
        }
        return result;
    }


}
