import java.util.ArrayList;
import java.util.List;

public class 快排 {
    class Solution {
        public List<Integer> sortArray(int[] nums) {
            //手写快排
            List<Integer> list = new ArrayList<>();
            if (nums==null||nums.length<=0) return list;
            quickSort(nums,0,nums.length-1);
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            return list;
        }
        public void quickSort(int[] array,int l,int r){
            if (l==r) return;
            if (l<r){
                int p = partition(array, l, r);
                quickSort(array,l,p-1);
                quickSort(array,p+1,r);
            }
        }
        //写一个partition函数，输入数组，数组左边界，数组右边界，返回将右边界排完序的坐标
        public int partition(int[] array,int l,int r){
            int less = l-1;
            int index = l;
            int num = array[r];
            while (index <r){
                if (array[index]<=num){
                    swap(array,++less,index++);
                }else {
                    index++;
                }
            }
            swap(array,r,less+1);
            return less+1;
        }
        //写一个swap函数
        public void swap(int[] array,int i,int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
    }
}
