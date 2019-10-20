package leetcode;

public class leetcode_1108 {
    class Solution {
        public String defangIPaddr(String address) {
            char[] chars = address.toCharArray();
            StringBuilder result = new StringBuilder();
//            char[] result = new char[chars.length + 3 * 2];2
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]=='.'){
                    result.append('[').append('.').append(']');
                }else{
                    result.append(chars[i]);
                }
            }
            return result.toString();
        }
    }
}
