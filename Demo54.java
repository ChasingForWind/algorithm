import java.util.ArrayList;

public class Demo54 {
    /*
<分析>：
解释下代码，设有数组大小为5。
对于第一个for循环
第一步：b[0] = 1;
第二步：b[1] = b[0] * a[0] = a[0]
第三步：b[2] = b[1] * a[1] = a[0] * a[1];
第四步：b[3] = b[2] * a[2] = a[0] * a[1] * a[2];
第五步：b[4] = b[3] * a[3] = a[0] * a[1] * a[2] * a[3];
然后对于第二个for循环
第一步
temp *= a[4] = a[4];
b[3] = b[3] * temp = a[0] * a[1] * a[2] * a[4];
第二步
temp *= a[3] = a[4] * a[3];
b[2] = b[2] * temp = a[0] * a[1] * a[4] * a[3];
第三步
temp *= a[2] = a[4] * a[3] * a[2];
b[1] = b[1] * temp = a[0] * a[4] * a[3] * a[2];
第四步
temp *= a[1] = a[4] * a[3] * a[2] * a[1];
b[0] = b[0] * temp = a[4] * a[3] * a[2] * a[1];
由此可以看出从b[4]到b[0]均已经得到正确计算。*/
    public class Solution {
        public int[] multiply(int[] A) {
            //没有考虑代码的鲁棒性
            //计算下三角
            //得到b[0] 的下三角初值为1
            int length = A.length;
            int[] B = new int[length];
            //一个for循环得下三角的值为：b[i] = a[0]*a[1]*a[2]*...a[i-1]
            if (length == 0) return B;
            else {
                B[0] = 1;
                for (int i = 1; i < length - 1; i++) {
                    //计算下三角
                    B[i] = A[i - 1] * B[i - 1];
                }
                //一个for循环 从b[n-2]开始 temp = a[n-1]
                int temp = 1;
                for (int j = length - 2; j >= 0; j--) {
                    temp = temp * A[j + 1];
                    //b[j] = b[j] * temp
                    B[j] = B[j] * temp;
                }
                return B;
            }
        }
    }
}
