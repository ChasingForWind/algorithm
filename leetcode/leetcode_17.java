package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_17 {
    class Solution {
        private String letterMap[] = {
                " ",    //0
                "",     //1
                "abc",  //2
                "def",  //3
                "ghi",  //4
                "jkl",  //5
                "mno",  //6
                "pqrs", //7
                "tuv",  //8
                "wxyz"  //9
        };
        List<String> list = new ArrayList<String>();
        public void helper(String bring,String str){
            if (str.length()==0){
                list.add(bring);
                return;
            }
            char c = str.charAt(0);
            String s = letterMap[c-'0'];
            char[] chars = s.toCharArray();
            for (int i=0;i<chars.length;i++){
                helper(bring+chars[i],str.substring(1));
            }
        }
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0) return list;
            helper("",digits);
            return list;
        }
    }
}
