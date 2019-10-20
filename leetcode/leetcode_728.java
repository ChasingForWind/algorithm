package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_728 {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list =new ArrayList<>();
            for (int j = left; j < right; j++) {
                if (Check(j)){
                    list.add(j);
                }
            }
            return list;
        }

        public boolean Check(int number) {
            String s = String.valueOf(number);
            char[] chars = s.toCharArray();
            boolean result = true;
            for (int i = 0; i < chars.length; i++) {
                if ((number % (chars[i] - 0)) == 0) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        }
    }
}
