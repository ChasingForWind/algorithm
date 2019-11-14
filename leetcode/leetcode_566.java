package leetcode;

import java.util.ArrayList;

public class leetcode_566 {
    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            ArrayList<Integer> array = new ArrayList<>();
            int[][] res = new int[r][c];
            for (int i=0;i<nums.length;i++){
                for (int j=0;j<nums[0].length;j++){
                    array.add(nums[i][j]);
                }
            }
            int count = 0;
            for(int k=0;k<r;k++){
                for (int m=0;m<c;m++){
                    if (count<array.size()){
                        res[k][m] = array.get(count);
                        count++;
                    }else{
                        return nums;
                    }
                }
            }
            return res;
        }
    }
}
