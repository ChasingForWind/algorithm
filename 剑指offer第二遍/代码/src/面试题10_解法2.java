public class 面试题10_解法2 {
    public class Solution {
        public int Fibonacci(int n) {
            /*动态规划*/
            if (n<=1) return n;
            int[] dp = new int[n+1];
            dp[0] =0;
            dp[1] =1;
            for (int i=2;i<=n;i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }
}
