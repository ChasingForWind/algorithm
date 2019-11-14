package leetcode;

public class leetcode_693 {
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int temp = n^(n>>1);
            return (temp&(temp+1))==0;
        }
    }
}
