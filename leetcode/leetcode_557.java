package leetcode;

public class leetcode_557 {
    class Solution {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        public String reverseWords(String s) {
            int flag = 0;
            for (int i =0;i<s.length();i++){
                if (s.charAt(i)==' '&&flag==0){
                    reverse(temp);
                    result.append(' ');
                    flag = 1;
                }
                if (s.charAt(i)==' ') reverse(temp);
                temp = temp.append(s.charAt(i));
            }
            reverse(temp);
            return result.toString();
        }
        public void reverse(StringBuilder temp){
            StringBuilder reverse = temp.reverse();
            result.append(reverse);
            temp.setLength(0);
        }
    }
}
