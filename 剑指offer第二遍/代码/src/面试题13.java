public class 面试题13 {
    public class Solution {
        int count=0;
        public int movingCount(int threshold, int rows, int cols)
        {
            Boolean[] matrix = new Boolean[cols * rows];
            for (int i=0;i<rows;i++){
                for (int j=0;j<cols;j++){
                    matrix[i*cols+j]=false;
                }
            }
            getCount(threshold,rows,cols,0,0,matrix);
            return count;
        }
        public void getCount(int threshold,int rows,int cols,int x,int y,Boolean[] matrix){
            if (canVisit(threshold,rows,cols,x,y,matrix)){
                count++;
                matrix[x*cols+y]=true;
                getCount(threshold,rows,cols,x+1,y,matrix);
                getCount(threshold,rows,cols,x-1,y,matrix);
                getCount(threshold,rows,cols,x,y+1,matrix);
                getCount(threshold,rows,cols,x,y-1,matrix);
            }
            return;
        }
        public boolean canVisit(int threshold,int rows,int cols,int x,int y,Boolean[] matrix){
            if (x<rows&&x>=0&&y<cols&&y>=0&&getSum(threshold,x,y)&&!matrix[x*cols+y]){
                return true;
            }else {
                return false;
            }
        }
        public boolean getSum(int threshold,int x,int y){
            int sumx=0;
            while (x>0){
                sumx=sumx+x%10;
                x=x/10;
            }
            int sumy=0;
            while (y>0){
                sumy=sumy+y%10;
                y=y/10;
            }
            if (sumy+sumx>threshold) return false;
            else return true;
        }
    }
}
