import java.util.ArrayList;
import java.util.List;

public class 归并排序 {
    class Solution {
        ArrayList<Integer> res = new ArrayList<>();
        public List<Integer> sortArray(int[] nums) {

            if (nums==null||nums.length==0) return res;
            sortArrayCore(nums,0,nums.length-1);
            for (int i = 0; i < nums.length; i++) {
                res.add(nums[i]);
            }
            return res;
        }
        public void sortArrayCore(int[] nums,int left,int right){
            if (left==right) return;
            int mid = left+(right-left)/2;
            sortArrayCore(nums,left,mid);
            sortArrayCore(nums,mid+1,right);
            int[] temp = new int[right - left + 1];
            int i =0;
            int index1= left;
            int index2 = mid+1;
            while (index1<=mid&&index2<=right){
                if (nums[index1]<=nums[index2]){
                    temp[i] = nums[index1];
                    index1++;
                    i++;
                }
                else {
                    temp[i] = nums[index2];
                    index2++;
                    i++;
                }
            }
            while (index1<=mid){
                temp[i] = nums[index1];
                index1++;
                i++;
            }
            while (index2<=right){
                temp[i] = nums[index2];
                index2++;
                i++;
            }
            i=0;
            for (int j = left; j <=right ; j++) {
                nums[j] = temp[i];
                i++;
            }
            return;
        }
    }
}
