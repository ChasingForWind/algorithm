package leetcode;

public class leetcode_832 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {


            for (int i = 0; i < A.length; i++) {
                //先定义翻转函数 输入int[] 输出int[]
                convert(A[i]);
                //定义反转函数 输入int[] 输出int[]
                convert2(A[i]);
            }
            return A;
        }

        public int[] convert(int[] a) {
            int length = a.length;
            for (int i = 0; i < length / 2; i++) {
                int temp = a[i];
                a[i] = a[length - i - 1];
                a[length - i - 1] = temp;
            }
            return a;
        }

        public int[] convert2(int[] a) {
            for (int j = 0; j < a.length; j++) {
                if (a[j]==0) a[j] = 1;
                else a[j] = 0;
            }
            return a;
        }
    }
}
