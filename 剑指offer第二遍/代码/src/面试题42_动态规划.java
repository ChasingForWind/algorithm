public class 面试题42_动态规划 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            int[] dp = new int[array.length];
            dp[0] = array[0];
            for (int i = 1; i < array.length; i++) {
                dp[i] = Math.max(dp[i-1]+array[i],array[i]);
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; i++) {
                if (dp[i]>max) max = dp[i];
            }
            return max;
        }
    }
}
