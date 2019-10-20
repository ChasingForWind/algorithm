package leetcode;

public class leetcode_704 {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int mid;
            while (left<right){
                mid = (left+right+1)>>>1;
                if (nums[mid]>target){
                    right = mid-1;
                }else{
                    left = mid;
                }
            }
            if (target == nums[left]) return left;
            else return -1;
        }
    }
}
