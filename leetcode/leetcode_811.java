package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_811 {
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            //创建结果数组
            List<String> result = new ArrayList<>();
            //创建一个hashmap
            HashMap<String, Integer> map = new HashMap<>();
            //一个大的强for循环
            for (String s: cpdomains){
                //针对每一个字符串，首先进行分割,成数字和字母
                String[] ss = s.split("\\s+");
                //对字母进行分割
                String[] sss = ss[1].split("\\.");
                //分割完成组成子域名放入hashmap中
                int count = Integer.valueOf(ss[0]);
                String str = "";
                for (int i=sss.length-1;i>=0;i--){
                    str = sss[i] + (i<sss.length-1?".":"")+ str;
                    map.put(str,map.getOrDefault(str,0)+count);
                }
            }
            //通过hashmap构造字符串放入结果数组中
            for (String key:map.keySet()){
                String str1 = String.valueOf(map.get(key)) + " "+ key ;
                result.add(str1);
            }
            return result;
        }
    }
}
