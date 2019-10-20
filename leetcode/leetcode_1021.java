package leetcode;

/*
输入："(()())(())"
输出："()()()"
* */
public class leetcode_1021 {
    class Solution {
        public String removeOuterParentheses(String S) {
            StringBuilder sb = new StringBuilder();
            int L = 1;
            int R = 0;
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) == '(') L++;
                else R++;

                if (R != L) sb.append(S.charAt(i));
                else {
                    L = 1;
                    R = 0;
                    i++;
                }
            }
            String s = sb.toString();
            return s;
        }
    }
}
