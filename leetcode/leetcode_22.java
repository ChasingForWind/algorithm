package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_22 {
    class Solution {
        ArrayList<String> res = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            helper("",0,0,n);
            return res;
        }
        public void helper(String s,int left,int right,int max){
            if (s.length()==2*max){
                res.add(s);
            }
            if (left<max){
                helper(s+"(",left+1,right,max);
            }
            if (right<max){
                helper(s+")",left,right+1,max);
            }
            return;
        }
    }
}
