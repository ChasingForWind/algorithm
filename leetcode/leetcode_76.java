package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode_76 {
    class Solution {
        public String minWindow(String s, String t) {
            //定义一些常量
            int left = 0;
            int right = 0;
            String res = "";
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c:t.toCharArray()){
                if (map.containsKey(c)){
                    Integer count = map.get(c);
                    count++;
                    map.put(c,count);
                }else{
                    map.put(c,1);
                }
            }
            //map中存储了t字符串中字符及出现次数
            //开始滑动
            while (right<s.length()){
                //right++
                right++;
                //将字符串进行判断
                while(jugle(left,right,map,s)){
                    //如果满足就放入一个函数进行字符串拼接和比对
                    res = helper(left,right,res,s);
                    left++;
                }
                //如果不满足，就继续滑动
            }
            return res;
        }
        public boolean jugle(int left,int right,HashMap<Character,Integer> map,String s){
            HashMap<Character,Integer> tempMap = (HashMap<Character, Integer>) map.clone();
            for (int i=left;i<right;i++){
                if (tempMap.containsKey(s.charAt(i))){
                    Integer num = tempMap.get(s.charAt(i));
                    num--;
                    map.put(s.charAt(i),num);
                    if (num==0){
                        tempMap.remove(s.charAt(i));
                    }
                }
            }
            return tempMap.size()==0?true:false;
        }
        public String helper(int left,int right,String res,String s){
            if (!res.equals("")&&(right-left)>res.length()) return res;
            StringBuilder sb = new StringBuilder("");
            for (int i = left;i<right;i++){
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }
}
