package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class leetcode_20 {
    class Solution {
        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('(',')');
            map.put('[',']');
            map.put('{','}');
            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i=0;i<chars.length;i++){
                if (map.containsKey(chars[i])){
                    stack.add(chars[i]);
                }else {
                    if (stack.size()==0) return false;
                    if (!map.get(stack.peek()).equals(chars[i])) return false;
                    else stack.pop();
                }
            }
            if (stack.size()>0) return false;
            return true;
        }


        }
}
