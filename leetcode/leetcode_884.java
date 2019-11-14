package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class leetcode_884 {
    class Solution {
        public String[] uncommonFromSentences(String A, String B) {
            //创建一个map
            HashMap<String, Integer> map = new HashMap<>();
            //分割字符串
            String[] a = A.split(" ");
            String[] b = B.split(" ");
            //对第一个循环，记录单词和出现次数
            for (String s:a){
                if (map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else {
                    map.put(s,1);
                }
            }
            //对第二个循环
            for (String s:b){
                //如果遇到相同单词
                //判断是否为1，如果是，就相减，如果不是就跳过
                //遇到不同单词，记录加一
                if (map.containsKey(s)){
                    if (map.get(s)==1){
                        map.put(s,map.get(s)-1);
                    }else {
                        continue;
                    }
                }else {
                    map.put(s,1);
                }

            }
            //第三个循环，出现次数为1的单词
            Set<String> key = map.keySet();
            ArrayList<String> strings = new ArrayList<>();
            for (String s:key){
                if (map.get(s)==1){
                    strings.add(s);
                }
            }
            String[] res = new String[strings.size()];
            for (int i=0;i<strings.size();i++){
                res[i] = strings.get(i);
            }
            return res;
        }
    }
}
