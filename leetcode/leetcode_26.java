package leetcode;

public class leetcode_26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length<0) return 0;
            if (nums.length==1) return 1;
            int slow=0;
            int fast = 1;
            while (fast<=nums.length-1){
                if (nums[fast]==nums[slow]){
                    fast++;
                    continue;
                }
                if (nums[fast]!=nums[slow]){
                    nums[slow+1] = nums[fast];
                    slow++;
                    fast++;
                }
            }
            return slow+1;
        }
    }
}
