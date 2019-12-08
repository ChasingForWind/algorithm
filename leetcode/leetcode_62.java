package leetcode;

public class leetcode_62 {
    class Solution {
        public int uniquePaths(int m, int n) {
            if (m<=0||n<=0) return 0;
            int F[][] = new int[m-1][n-1];
            for (int i=0;i<m-1;i++){
                F[0][i] = 0;
            }
            for (int j=0;j<n;j++){
                F[j][0] =0;
            }
            for (int i=1;i<n;i++){
                for (int j=1;j<m;j++){
                    F[i][j] = F[i-1][j]+F[i][j-1];
                }
            }
            return F[m-1][n-1];
        }
    }
}
