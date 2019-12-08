package leetcode;

public class leetcode_66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int flag = 1;
            if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
            } else {
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] + flag > 9) {
                        digits[i] = 0;
                    } else {
                        digits[i] = digits[i] + flag;
                        flag = 0;
                        break;
                    }
                }
                if (flag==1){
                    int[] newdigits = new int[digits.length + 1];
                    newdigits[0]=1;
                    for (int i=1;i<newdigits.length;i++){
                        newdigits[i]=0;
                    }
                    return newdigits;
                }
            }
            return digits;
        }
    }
}
