package leetcode;

import java.util.Arrays;

public class leetcode_908 {
    class Solution {
        public int smallestRangeI(int[] A, int K) {
            Arrays.sort(A);
            int min = A[0];
            int max = A[A.length-1];
            int temp = max - min;
            if (temp-2*K<=0) return 0;
            else return temp-2*K;
        }
    }
}
