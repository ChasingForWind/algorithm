package leetcode;

public class leetcode_171 {
    class Solution {
        public int titleToNumber(String s) {
            char[] chars = s.toCharArray();
            int num=0;
            for (int i = 0; i < chars.length; i++) {
                num += (int) ((chars[i]-64)*Math.pow(26,chars.length-1-i));
            }
            return num;
        }
    }
}
