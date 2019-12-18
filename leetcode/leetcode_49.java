package leetcode;

import java.util.*;

public class leetcode_49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
            if (strs.length==0) return result;
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            for (int i=0;i<strs.length;i++){
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String keys = String.valueOf(chars);
                if (map.containsKey(keys)){
                    ArrayList<String> list = map.get(keys);
                    list.add(strs[i]);
                    map.put(keys,list);
                }else {
                    ArrayList<String> newlist = new ArrayList<>();
                    newlist.add(strs[i]);
                    map.put(keys,newlist);
                }
            }
            Set<String> key = map.keySet();
            for (String s:key){
                result.add(map.get(s));
            }
            return result;
        }
    }
}
