package leetcode;

import java.util.HashMap;

public class leetcode_13 {
    class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int res=0;
            for (int i=0;i<s.length();i++){
                int cur = map.get(s.charAt(i));
                if (i+1<s.length()) {
                    int next = map.get(s.charAt(i+1));
                    if (cur<next){
                        res-=cur;
                    }else{
                        res+=cur;
                    }
                }else {
                    res+=cur;
                }
            }
            return res;
        }
    }
}
