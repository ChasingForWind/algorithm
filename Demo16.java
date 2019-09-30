import org.junit.Test;

public class Demo16 {
    /*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
        保证base和exponent不同时为0*/
    public class Solution {
        public double Power(double base, int exponent) {
            //当base=0时
            if (base == 0) {
                return 0;
            }
            if (exponent==0){
                return 1;
            }
            //当exponent>0时
            if (exponent > 0) {
                double result = base;
                for (int i = 1; i < exponent; i++) {
                    result = result * base;
                }
                return result;
            }
            //当exponent<0时
            else {
                exponent = -exponent;
                double result = base;
                for (int i = 1; i < exponent; i++) {
                    result = result * base;
                }
                return 1/result;
            }
        }
    }

}
