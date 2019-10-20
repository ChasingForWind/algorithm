package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_728_test {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
        System.out.println(list);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int j = left; j < right; j++) {
            if (Check(j)) {
                list.add(j);
            }
        }
        return list;
    }

    public static boolean Check(int number) {
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();
        boolean result = true;
        for (int i = 0; i < chars.length; i++) {
            if ((number % (chars[i] - 48)) == 0) {
                continue;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
