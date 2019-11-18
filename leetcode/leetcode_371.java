package leetcode;

public class leetcode_371 {
    class Solution {
        public int getSum(int a, int b) {
            int temp = a^b;
            int carry = (a&b)<<1;
            while (carry!=0){
                temp = temp^carry;
                carry=(temp&carry)<<1;
            }
            return temp;
        }
    }
}
