import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo47 {
    /*在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
    并返回它的位置, 如果没有则返回 -1（需要区分大小写）.*/
    public class Solution {
        public int FirstNotRepeatingChar(String str) {
            //代码鲁棒性
            if (str.length() < 0 || str.length() > 10000) return 0;
            //创建hash表进行第一次循环
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    Integer time = map.get(str.charAt(i));
                    time = time + 1;
                    map.put(str.charAt(i), time);
                } else {
                    map.put(str.charAt(i), 1);
                }
            }
            //从字符串中读取数字进行第二次循环
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                Integer time1 = map.get(str.charAt(j));
                if (time1 > 1) {
                    count = time1;
                    break;
                }
            }
            return count;
        }
    }
}
