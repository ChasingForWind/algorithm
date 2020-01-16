public class 面试题12 {
    public class Solution {
        public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
            boolean[] ifVisited = new boolean[matrix.length];
            for (int i=0;i<rows;i++){
                for (int j=0;j<cols;j++){
                    ifVisited[i*cols+j]=false;
                }
            }
            int length = str.length;
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (hasPathCore(matrix, rows, cols, str, length, row, col, ifVisited)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean hasPathCore(char[] matrix, int rows, int cols, char[] str, int length, int row, int col, boolean[] ifVisited) {
            if (length == 0) return true;
            boolean path = false;
            if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[str.length - length] && !ifVisited[row * cols + col]) {
                ifVisited[row * cols + col] = true;
                length--;
                path = hasPathCore(matrix, rows, cols, str, length, row + 1, col, ifVisited) || hasPathCore(matrix, rows, cols, str, length, row - 1, col, ifVisited)
                        || hasPathCore(matrix, rows, cols, str, length, row, col + 1, ifVisited) || hasPathCore(matrix, rows, cols, str, length, row, col - 1, ifVisited);
                if (!path) {
                    length++;
                    ifVisited[row * cols + col] = false;
                }
            }
            return path;
        }
    }
}
