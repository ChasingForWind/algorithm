package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_1002 {
    class Solution {
        public List<String> commonChars(String[] A) {
            int[][] character = new int[26][A.length]; //创建二维数组默认值为0
            //进行A.length次循环，将每次循环的值统计的值放入character中
            for (int i=0;i<A.length;i++){
                check(character,A[i],i);
            }
            //进行26次循环，寻找每个字母在字符串中出现的最小次数
            List<String> list = new ArrayList<>();
            for (int j=0;j<26;j++){
                int time = findMin(character,j);
                if (time!=0) {
                    for (int k =time;k>0;k--){
                        list.add(tostring(k));
                    }
                }
            }
            return list;
        }
        public void check(int[][] character,String str,int k){
            for (int i=0;i<str.length();i++){
                character[str.charAt(i)-97][k]++;
            }
        }
        public int findMin(int[][] character,int j){
            int min = 102;
            for (int k=0;k<character[j].length;k++){
                if(character[j][k]<min) min = character[j][k];
            }
            return min;
        }
        public String tostring(int k){
            char ch = (char)(k+97);
            String str = ch+"";
            return str;
        }
    }
}
