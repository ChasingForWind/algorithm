import java.util.HashMap;

public class 面试题50 {
    public class Solution {
        //哈希表扫描两次
        public int FirstNotRepeatingChar(String str) {
            if (str==null) return -1;
            HashMap<Character, Integer> map = new HashMap<>();
            //第一次
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) map.put(str.charAt(i),map.get(str.charAt(i))+1);
                else map.put(str.charAt(i),1);
            }
            //第二次
            for (int j = 0; j < str.length(); j++) {
                if (map.get(str.charAt(j))==1) return j;
            }
            return -1;
        }
    }
}
