import java.util.ArrayList;
public class 面试题76 {
    public class Solution {
        public int[] multiply(int[] A) {
            int[] B = new int[A.length];
            B[0] = 1;
            //下半部分
            for (int i = 1; i < A.length; i++) {
                B[i] = B[i-1]*A[i-1];
            }
            //上半部分
            int temp = 1;
            for (int i = A.length-2; i >=0 ; i--) {
                temp = temp*A[i+1];
                B[i] = B[i]*temp;
            }
            return B;
        }
    }
}
