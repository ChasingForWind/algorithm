import java.util.ArrayList;

public class 面试题40 {
    public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> res = new ArrayList<>();
            if (input==null||input.length<0||k<=0||input.length<k) return res;
            int start = 0;
            int end = input.length-1;
            int index = Partition(input, start, end);
            while (index!=k-1){
                if (index<k-1){
                    start = index+1;
                    index = Partition(input, start, end);
                }
                else{
                    end = index-1;
                    index = Partition(input, start, end);
                }
            }
            for (int i = 0; i < k; i++) {
                res.add(input[i]);
            }
            return res;
        }

        public int Partition(int[] array,int l,int r){
            int less = l-1;
            int num = array[r];
            int index = l;
            while (index<r){
                if (array[index]>num) index++;
                else {
                    swap(array,++less,index++);
                }
            }
            swap(array,less+1,r);
            return less+1;
        }
        public void swap(int[] array,int i,int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
