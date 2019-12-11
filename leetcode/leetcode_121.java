package leetcode;

public class leetcode_121 {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length==0) return 0;
            int min = prices[0];
            int profit = 0;
            for (int i=0;i<prices.length;i++){
                profit = prices[i]-min;
                if (min>prices[i]){
                    min=prices[i];
                }
                prices[i] = profit;
            }
            int max = Integer.MIN_VALUE;
            for (int j=0;j<prices.length;j++){
                if (prices[j]>max) max = prices[j];
            }
            return max;
        }
    }
}
