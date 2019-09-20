public class Demo13 {
    public class Solution {
        public int movingCount(int threshold, int rows, int cols) {
            //主函数
            int flag[][] = new int[rows][cols];//标志判断路程是否已经走过初始值为false
            //调用的回溯递归函数
            return helper(0, 0, rows, cols, flag, threshold);
            //判断求和函数
        }

        private int helper(int row, int col, int rows, int cols, int[][] flag, int threshold) {
            if (col < 0 || col >= cols || row < 0 || row >= rows || flag[row][col] == 1 ||numSum(col)+numSum(row)>threshold){
                return 0;
            }
            flag[row][col] = 1;
            return 1+helper(row+1,col,rows,cols,flag,threshold)
                    +helper(row,col+1,rows,cols,flag,threshold)
                    +helper(row-1,col,rows,cols,flag,threshold)
                    +helper(row,col-1,rows,cols,flag,threshold);
        }

        private int numSum(int i) {
            int sum = 0;
            do {
                sum += i % 10;
            } while ((i = i / 10) > 0);
            return sum;
        }
    }
}
