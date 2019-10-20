package leetcode;

public class leetcode_852 {
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int max=0;
            for (int i = 0; i < A.length; i++) {
                if (A[i]>A[max]){
                    max = i;
                }
                if ((i+1)<A.length&&A[i+1]<A[max]){
                    break;
                }
            }
            return max;
        }
    }
}
