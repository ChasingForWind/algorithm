package leetcode;

public class leetcode_75 {
    class Solution {
        public void sortColors(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int cur = 0;
            while (cur <= right) {
                if (nums[cur] == 2) {
                    int temp = nums[right];
                    nums[right] = nums[cur];
                    nums[cur] = temp;
                    right--;
                } else if (nums[cur] == 0) {
                    int temp = nums[left];
                    nums[left] = nums[cur];
                    nums[cur] = temp;
                    left++;
                    cur++;
                } else{
                    cur++;
                }
            }
        }
    }
}
