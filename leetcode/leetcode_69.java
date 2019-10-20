package leetcode;

public class leetcode_69 {
    class Solution {
        public int mySqrt(int x) {
            long left = 0;
            long right = x/2 +1;//为了照顾1
            long mid;
            long sqrt;
            while (left<right){
                mid = (left+right+1)>>>1;
                sqrt = mid*mid;
                if (sqrt>x){
                    right = mid -1;
                }else {
                    left = mid;
                }
            }
            return (int)left;
        }
    }
}
