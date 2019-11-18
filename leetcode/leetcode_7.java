package leetcode;

public class leetcode_7 {
    class Solution {
        public int reverse(int x) {
            int rev=0;
            int pop=0;
            while(x!=0){
                pop = x%10;
                x=x/10;

                if (rev/10>Integer.MAX_VALUE||rev/10==Integer.MAX_VALUE&&pop>7) return 0;
                if (rev/10<Integer.MIN_VALUE||rev/10==Integer.MIN_VALUE&&pop<-8) return 0;
                rev = rev*10 + pop;
            }
            return rev;
        }
    }
}
