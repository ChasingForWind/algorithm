package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_561 {
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int result = 0;
            for (int i = 0; i < nums.length; i+=2) {
                result = result + nums[i];
            }
            return result;
        }
    }
}
