public class 面试题49 {
    public class Solution {
        public int GetUglyNumber_Solution(int index) {
            if (index <= 0) return 0;
            if (index == 1) return 1;
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;

            int[] dp = new int[index];
            dp[0] = 1;
            for (int i = 1; i < index; i++) {
                dp[i] = Math.min(dp[index2] * 2,Math.min(dp[index3]*3,dp[index5]*5));
                if (dp[i]==dp[index2]*2) index2++;
                if (dp[i]==dp[index3]*3) index3++;
                if (dp[i]==dp[index5]*5) index5++;
            }

            return dp[index-1];
        }
    }
}
