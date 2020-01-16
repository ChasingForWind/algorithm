public class 面试题21_进阶版 {
    /*使用插入排序的思想，保证数轴的有序性*/
    public class Solution {
        public void reOrderArray(int [] array) {
            int k = 0;//记录已经摆好位置的奇数的个数
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==1){
                    int j=i;
                    while (j>k){
                        swap(j,j-1,array);
                        j--;
                    }
                    k++;
                }
            }
        }
        public void swap(int index,int i,int[] array){
            int temp =array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
