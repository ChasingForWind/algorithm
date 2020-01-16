import java.util.ArrayList;
public class 面试题29 {
    public class Solution {
        ArrayList<Integer> result = new ArrayList<>();
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            if (matrix==null||matrix.length<=0||matrix[0].length<=0) return result;
            int i = 0;
            while (matrix.length>2*i&&matrix[0].length>2*i){
                Print(matrix,i);
                i++;
            }
            return result;
        }
        public void Print(int[][] matrix,int i){
            int endX = matrix[0].length-i-1;
            int endY = matrix.length-i-1;

            //从左向右,第一行全部打完
            for (int j = i; j <=endX ; j++) {
                result.add(matrix[i][j]);
            }
            //从上往下，条件是有两行，从第二行开始打
            if (i<endY){
                for (int j = i+1; j <=endY ; j++) {
                    result.add(matrix[j][endX]);
                }
            }
            //从右往左，条件是右两行两列。从右下极点向左一位开始打
            if(i<endX&&i<endY){
                for (int j = endX-1; j >=i ; j--) {
                    result.add(matrix[endY][j]);
                }
            }
            //从下往上，条件是有三行两列。从左下极点向上一位开始打
            if (i<endX&&i<endY-1){
                for (int j = endY-1; j >= i+1 ; j--) {
                    result.add(matrix[j][i]);

                }
            }
        }
    }
}
