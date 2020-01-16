public class 面试题16_解法3 {
    public class Solution {
        public double Power(double base, int exponent) {
            //如果base为0；
            if (base==0) return 0;
            //如果exponet为负数
            if (exponent<0){
                double temp = positive(base,-exponent);
                return 1/temp;
            }else {//如果exponet为正数
                return positive(base,exponent);
            }
        }
        public double positive(double base, int exponent) {
            if (exponent == 0) return 1;
            if (exponent == 1) return base;
            double result = Power(base,exponent>>1);
            result = result*result;
            if ((exponent%2)==1) return result*base;
            else return result;
        }
    }
}
