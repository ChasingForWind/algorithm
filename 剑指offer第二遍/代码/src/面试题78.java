import java.util.ArrayList;
import java.util.HashMap;

public class 面试题78 {
    /*第一个不重复的字符*/
    public class Solution {
        //Insert one char from stringstream
        //维护一个hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //维护一个arraylist
        ArrayList<Character> array = new ArrayList<>();
        public void Insert(char ch)
        {
            //在arraylist中维护插入顺序
            array.add(ch);
            //直接向hashmap中判断字符出现次数
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce()
        {
            //遍历arraylist，找到第一个在hashmap中出现次数为1的字符
            for (int i = 0; i < array.size(); i++) {
                if (map.get(array.get(i))==1) return array.get(i);
            }
            return '#';
        }
    }
}
