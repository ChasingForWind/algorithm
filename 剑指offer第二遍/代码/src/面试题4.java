public class 面试题4 {
    public class Solution {
        public boolean Find(int target, int [][] array) {
            //代码鲁棒性
            if (array==null||array.length==0) return false;
            //标志位
            boolean flag =false;
            //很在乎行和列
            int col = array.length-1;
            int row = 0;

            while (row<=array[0].length-1&&col>=0){
                if(array[col][row]>target) col--;
                else if (array[col][row]<target) row++;
                else {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }
}
