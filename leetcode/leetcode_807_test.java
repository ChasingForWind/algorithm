package leetcode;

public class leetcode_807_test {
    public static void main(String[] args) {
        int[][] grid = {{3,2,9,0},{0,4,2,3},{8,5,6,1},{4,7,3,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));

    }
        public static int maxIncreaseKeepingSkyline(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    int temp = Math.min(findColMax(grid, i), findRowMax(grid, j)) - grid[i][j];
                    if (temp > 0) {
                        count += temp;
                    } else {
                        count = count;
                    }
                }
            }
            return count;
        }


    public static int findRowMax(int[][] grid, int row) {
        int max = grid[0][row];
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][row]>max){
                max = grid[i][row];
            }
        }
        return max;
    }

    public static int findColMax(int[][] grid, int col) {
        int max = grid[col][0];
        for(int i =0;i<grid[0].length;i++){
            if (grid[col][i]>max){
                max = grid[col][i];
            }
        }
        return max;
    }
}
