import java.util.ArrayList;

/*次方法可行，但是相对位置会发生改变*/
public class 面试题21 {
    public class Solution {
        public void reOrderArray(int [] array) {
           int index1 = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2==0) continue;
                else {
                    swap(index1+1,i,array);
                    index1++;
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
