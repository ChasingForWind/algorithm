package leetcode;

public class leetcode_476 {
    class Solution {
        public int findComplement(int num) {
            int temp = num;
            int num2 = 1;
            while (temp > 0) {
                temp >>= 1;
                num2 <<= 1;
            }
            num2 = num2 - 1;
            return num ^ num2;
        }
    }
}
