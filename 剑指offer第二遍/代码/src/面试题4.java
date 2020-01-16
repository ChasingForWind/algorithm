public class 面试题4 {
    public class Solution {
        public boolean Find(int target, int [][] array) {
            if (array==null||array.length==0) return false;
            boolean flag =false;
            int col = array.length-1;
            int row = array[0].length-1;
            while (row>=0&&col>=0){
                if (array[array.length-1-col][row]>target){
                    row--;
                    continue;
                }else if (array[array.length-1-col][row]<target){
                    col--;
                    continue;
                }else {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }
}
