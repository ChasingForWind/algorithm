public class 面试题16_解法2 {
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
        public double positive(double base,int exponent){
            double result = 1;
            for (int i=0;i<exponent;i++){
                result = base*result;
            }
            return result;
        }
    }
}
