package leetcode;

public class leetcode_389 {
    class Solution {
        public char findTheDifference(String s, String t) {
            String r = s + t;
            char[] chars = r.toCharArray();
            int res=0;
            for (int i=0;i<chars.length;i++){
                res = res^r.charAt(i);
            }
            return (char) res;
        }
    }
}
