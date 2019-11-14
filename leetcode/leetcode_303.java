package leetcode;

import javafx.util.Pair;

import java.util.HashMap;

public class leetcode_303 {
    /*class NumArray {
        private HashMap<String,Integer> map = new HashMap<>();
        public NumArray(int[] nums) {
            for (int i=0;i<nums.length;i++){
                int sum=0;
                for (int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    String s = String.valueOf(i)+String.valueOf(j);
                    map.put(s,sum);
                }
            }

        }

        public int sumRange(int i, int j) {
            String s = String.valueOf(i)+String.valueOf(j);
            return map.get(s);
        }
    }*/
    class NumArray {
        private int[] sum;
        public NumArray(int[] nums) {
            sum = new int[nums.length+1];
            for (int i=0;i<nums.length;i++){
                sum[i+1] = nums[i]+sum[i];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j+1]-sum[i];
        }
    }

}
