package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_784 {
    class Solution {
        List<String> list = new ArrayList<String>();

        public List<String> letterCasePermutation(String S) {
            char[] str = S.toCharArray();
            helper(str, 0);
            return list;
        }
        public void helper(char[] str,int index){
            if (index==str.length){
                list.add(new String(str));
                return;
            }
            if (str[index]>='a'&&str[index]<='z'){
                helper(str,index+1);
                str[index]-=32;
                helper(str,index+1);
                str[index]+=32;
            }else if(str[index]>='A'&&str[index]<='Z'){
                helper(str,index+1);
                str[index]+=32;
                helper(str,index+1);
                str[index]-=32;
            }else {
                helper(str,index++);
            }
            return;
        }
    }

}
