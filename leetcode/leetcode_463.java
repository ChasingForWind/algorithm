package leetcode;

public class leetcode_463 {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int count=0;//记录有多少个位1的小岛
            int side=0;//记录有多少个重合的边
            for (int i=0;i<grid.length;i++){
                for (int j=0;j<grid[0].length;j++){
                    if (grid[i][j]==1) {
                        count++;
                        if ((j-1>=0)&&(grid[i][j-1]==1)) side++;//上
                        if ((j+1<grid[0].length)&&(grid[i][j+1]==1)) side++;//下
                        if ((i-1>=0)&&(grid[i-1][j]==1)) side++; //左
                        if ((i+1<grid.length)&&(grid[i+1][j]==1)) side++;//右
                    }
                }
            }
            return 4*count-side;
        }
    }
}
