package classes;

/**
 * @author wr
 * @date 2020/3/8 18:23
 */
public class Application {
    public static void main(String[] args) {
        int i = new Application().numSquares(15);
        int i2 = new Application().numSquares(15);
        System.out.println(i);
        System.out.println(i2);
    }

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<n+1;i++){
            //dp[i] = i;
            for(int j=1;i-j*j>=0;j++){
                dp[i] = Math.min(i,dp[i-j*j]+1);
            }
        }
        return dp[n];
    }

    public int numSquares2(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<n+1;i++){
            dp[i] = i;
            for(int j=1;i-j*j>=0;j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }


}
