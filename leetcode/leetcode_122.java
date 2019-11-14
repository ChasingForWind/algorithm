package leetcode;

public class leetcode_122 {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length <= 1) return 0;

            int hold;
            int prex;
            int profit = 0;

            for (int i = 1; i < prices.length; i++) {
                hold = prices[i];
                prex = prices[i - 1];
                if (hold>prex){
                    profit += hold-prex;
                }
            }
            return profit;
        }
    }
}
