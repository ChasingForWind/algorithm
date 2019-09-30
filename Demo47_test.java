import java.util.LinkedHashMap;

public class Demo47_test {
    public static void main(String[] args) {
        String s = "dcaeeef";
        int i = FirstNotRepeatingChar(s);
        System.out.println(i);
    }
    public static int FirstNotRepeatingChar(String str) {
        //代码鲁棒性
        if (str.length() < 0 || str.length() > 10000) return 0;
        //创建hash表进行第一次循环
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                Integer time = map.get(str.charAt(i));
                time=time+1;
                map.put(str.charAt(i), time);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        //从字符串中读取数字进行第二次循环
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            Integer time1 = map.get(str.charAt(j));
            if (time1>1) {
                count = time1;
                break;
            }
        }
        return count;
    }
}
