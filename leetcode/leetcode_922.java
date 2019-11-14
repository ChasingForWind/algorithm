package leetcode;

public class leetcode_922 {
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int even = 0;
            int odd = 1;
            for (;even<A.length;even+=2){
                if (A[even]%2==1){
                    while (A[odd]%2==1){
                        odd+=2;
                    }
                    int temp = A[even];
                    A[even] = A[odd];
                    A[odd] = temp;
                }
            }
            return A;
        }
    }
}
