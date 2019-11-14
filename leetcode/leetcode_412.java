package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_412 {
    class Solution {
        public List<String> fizzBuzz(int n) {
            ArrayList<String> res = new ArrayList<>();
            for (int i = 0; i < n; i++){
                res.add(helper(i+1));
            }
            return res;
        }
        public String helper(int i){
            StringBuilder sb = new StringBuilder("");
            if ((i%3)==0) sb.append("Fizz");
            if ((i%5)==0) sb.append("Buzz");
            if((i%3)!=0&&(i%5)!=0) sb.append(i);
            return sb.toString();
        }
    }
}
