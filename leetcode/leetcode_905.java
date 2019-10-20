package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class leetcode_905 {
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) even.add(A[i]);
                else odd.add(A[i]);
            }
            for (Integer i : odd) {
                even.add(i);
            }
            for (int i = 0; i < A.length; i++) {
                A[i] = even.get(i);
            }
            return A;
        }
    }
}
