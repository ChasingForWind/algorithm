import java.util.ArrayList;
public class 面试题11 {
    public class Solution {
        public int minNumberInRotateArray(int [] array) {
            if (array.length==1) return array[0];
            int left= 0;
            int right = array.length-1;
            int mid=0;
            while (left<right){
                mid = left + (right-left)/2;
                if (array[mid]>array[left]){
                    left=mid;
                }else if (array[mid]<array[right]){
                    right=mid;
                }else {
                    left++;
                }
            }
            return array[mid+1];
        }
    }
}
