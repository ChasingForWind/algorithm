package leetcode;

import java.util.HashMap;

public class leetcode_1160_test {
    public static void main(String[] args) {
       String[] s = {"hello","world","leetcode"};
       String ss = "welldonehoneyr";
       countCharacters(s,ss);
    }
    public static int countCharacters(String[] words, String chars) {
        //建立一个hashmap存储chars的值
        //定义count
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            if (map.get(chars.charAt(i)) != null) {
                Integer temp = map.get(chars.charAt(i));
                temp++;
                map.put(chars.charAt(i), temp);
                continue;
            }
            map.put(chars.charAt(i), 1);
        }
        //强for循环words
        for (int j = 0; j < words.length; j++) {
            //遍历单独的word
            //设置标志位
            String word = words[j];
            Boolean flag = true;
            HashMap<Character, Integer> clone = (HashMap<Character, Integer>) map.clone();
            for (int k = 0; k < word.length(); k++) {
                //遇到一个字母，hashmap中的计数减1
                if (clone.get(word.charAt(k)) == null) {
                    flag = false;
                    break;
                }
                if (clone.get(word.charAt(k)) == 0) {
                    flag = false;
                    break;
                }
                Integer temp2 = clone.get(word.charAt(k));
                temp2--;
                clone.put(word.charAt(k), temp2);
            }
            //完成循环后标志位还是true则count加上这个字母的长度
            if (flag == true) count = count + word.length();
        }
        //返回count
        return count;
    }


}
