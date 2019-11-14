package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode_961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                if (map.get(A[i])==null) map.put(A[i],1);
                else map.put(A[i],map.get(A[i])+1);
            }
            int size = map.size();
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
            for (Map.Entry<Integer, Integer> entry:entries){
                if (entry.getValue()==size-1){
                    return entry.getKey();
                }
            }
            return 0;
        }
    }
}
