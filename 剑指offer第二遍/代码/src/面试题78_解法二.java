import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class 面试题78_解法二 {
    public class Solution {
        //Insert one char from stringstream
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        public void Insert(char ch)
        {
            //向hashlinkedlist内添加字符
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce()
        {
            //按照顺序遍历
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry:entries){
                if (entry.getValue()==1) return entry.getKey();
            }
            return '#';
        }
    }
}
