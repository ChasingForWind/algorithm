package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode_804 {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            //定义翻译表
            String[] trans = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            //建立一个翻译器
            //遍历数组进行翻译，翻译后的字符加入hashSet集合，集合自动去重
            Set<String> set = new HashSet<>();
            for (int j = 0; j < words.length; j++) {
                set.add(translate(trans,words[j]));
            }
            //检查集合数目
            return set.size();
        }

        public String translate(String[] trains, String word) {
            char[] chars = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                sb.append(trains[chars[i] - 97]);
            }
            return sb.toString();
        }
    }
}
