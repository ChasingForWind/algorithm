package leetcode;

public class leetcode_1217 {
    class Solution {
        public int minCostToMoveChips(int[] chips) {
            int even = 0;
            int odd = 0;
            for (int i = 0; i < chips.length; i++) {
                if (chips[i] % 2 == 0) even++;
                else odd++;
            }
            return Math.min(even, odd);
        }
    }
}
