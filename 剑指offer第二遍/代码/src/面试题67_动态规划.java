public class 面试题67_动态规划 {
    public class Solution {
        public int JumpFloor(int target) {
            if (target==1) return 1;
            if (target==2) return 2;
            int[] dp = new int[target];
            dp[0] = 1;
            dp[1] = 2;

            for (int i = 2; i <target ; i++) {
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[target-1];
        }
    }
}
