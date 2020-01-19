import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 面试题44 {
    public class Solution {
        public String PrintMinNumber(int [] numbers) {
            ArrayList<Integer> list = new ArrayList<>();
            if (numbers==null||numbers.length<0) return null;
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer s1, Integer s2) {
                    String str1 = s1+""+s2;
                    String str2 = s2+""+s1;
                    return str1.compareTo(str2);
                }
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            return sb.toString();
        }
    }
}
