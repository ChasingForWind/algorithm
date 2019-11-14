package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode_1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashSet<Integer> set = new HashSet<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                count = set.size();
                set.add(arr[i]);
                if (set.size()>count){
                    map.put(arr[i],1);
                }else{
                    Integer number = map.get(arr[i]);
                    number++;
                    map.put(arr[i],number);
                }
            }
            HashSet<Integer> check = new HashSet<Integer>();
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
            for (Map.Entry<Integer,Integer> entry:entries){
                check.add(entry.getValue());
            }
            if (check.size()<map.size()) return false;
            else return true;
        }
    }
}
