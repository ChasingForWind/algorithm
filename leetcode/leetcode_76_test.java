package leetcode;

import java.util.HashMap;

public class leetcode_76_test {
    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        String s1 = minWindow(s, t);
        System.out.println(s1);
    }

    public static String minWindow(String s, String t) {
        //定义一些常量
        int left = 0;
        int right = 0;
        int counter = t.length();
        String res = "";
        /*int[] array = new int[60];
        for (Character c:t.toCharArray()){
            int temp = array[c-65];
            temp++;
            array[c-65] = temp;
        }*/
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //map中存储了t字符串中字符及出现次数
        //开始滑动
        while (right < s.length()) {
            //right++
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) > 0) {
                    map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                    counter--;
                } else {
                    map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                }
            }
            right++;
            //将字符串进行判断
            while (counter == 0) {
                //如果满足就放入一个函数进行字符串拼接和比对
                res = helper(left, right, res, s);
                if (map.containsKey(s.charAt(left))) {
                    if (map.get(s.charAt(left)) == 0) {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                        counter++;
                    } else {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    }
                }
                left++;
            }
            //如果不满足，就继续滑动
        }
        return res;
    }

    /* public static boolean jugle(int left,int right,int[] array,String s){
         int[] clone = array.clone();
         for (int i=left;i<right;i++){
            if (clone[s.charAt(i)-65]!=0){
                int temp = clone[s.charAt(i)-65];
                temp--;
                clone[s.charAt(i)-65] = temp;
            }
         }
         boolean flag = true;
         for (int j=0;j<clone.length;j++){
             if (clone[j]!=0){
                 flag = false;
                 return flag;
             }
         }
         return flag;
     }*/
    public static String helper(int left, int right, String res, String s) {
        if (!res.equals("") && (right - left) > res.length()) return res;
        StringBuilder sb = new StringBuilder("");
        for (int i = left; i < right; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
