public class 面试题71_解法二递归 {
    public class Solution {
        public double Power(double base, int exponent) {
            if (exponent>=0) return PowerCore(base,exponent);
            else return 1/PowerCore(base,-exponent);
        }
        public double PowerCore(double base, int exponent) {
            if (exponent == 0) return 1;
            if (exponent == 1) return base;
            if (exponent % 2 == 0)
                return Power(base, exponent / 2) * Power(base, exponent / 2);
            else
                return Power(base, exponent / 2+1) * Power(base, exponent / 2);
        }
    }
}
