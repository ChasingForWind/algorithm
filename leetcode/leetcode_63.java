package leetcode;

public class leetcode_63 {
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int[][] map = new int[obstacleGrid.length][obstacleGrid[0].length];
            for (int i=0;i<obstacleGrid[0].length;i++){
                if (obstacleGrid[0][i]==0) map[0][i] = 1;
                else {
                    for (int j=i;j<obstacleGrid[0].length;j++){
                        map[0][j] = 0;
                    }
                    break;
                }
            }
            for (int i=0;i<obstacleGrid.length;i++){
                if (obstacleGrid[i][0]==0) map[i][0] = 1;
                else {
                    for (int j=i;j<obstacleGrid.length;j++){
                        map[j][0] = 0;
                    }
                    break;
                }
            }
            for (int i=1;i<obstacleGrid.length;i++){
                for (int j=1;j<obstacleGrid[0].length;j++){
                    if (obstacleGrid[i][j]==1){
                        map[i][j]=0;
                    }else{
                        map[i][j]=map[i-1][j]+map[i][j-1];
                    }
                }
            }
            return map[obstacleGrid.length-1][obstacleGrid[0].length-1];

        }
    }
}
