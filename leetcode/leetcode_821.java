package leetcode;

public class leetcode_821 {
    class Solution {
        public int[] shortestToChar(String S, char C) {
            //从右往左
            int right = 10001;
            int left = 10001;
            int[] A = new int[S.length()];
            for (int i = S.length() - 1; i >= 0; i--) {
                if (S.charAt(i)==C) right = 0;
                else right++;
                A[i] = right;
            }
            for (int i=0;i<A.length;i++){
                if (S.charAt(i)==C) left = 0;
                else left++;

                if (A[i]>left) A[i] = left;
            }

            return A;
        }
    }
}
