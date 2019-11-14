package leetcode;

public class leetcode_1103 {
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            //利用当前所分的糖果个数对人数取余就刚好是对应的下标
            int curr_give = 0;
            int[] res = new int[num_people];
            while (candies > 0) {
                res[curr_give % num_people] = Math.min(++curr_give, candies);
                candies = candies - curr_give;
            }
            return res;
        }
    }
}
