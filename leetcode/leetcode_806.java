package leetcode;

import java.util.HashMap;

public class leetcode_806 {
    class Solution {
        public int[] numberOfLines(int[] widths, String S) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < widths.length; i++) {
                map.put((char) (i + 97), widths[i]);
            }
            int col = 1;
            int num = 0;
            for (int k = 0; k < S.length(); k++) {
                num = num + map.get(S.charAt(k));
                if (num>100){
                    col++;
                    num = map.get(S.charAt(k));
                }
            }
            int[] result = {col,num};
            return result;
        }
    }
}
