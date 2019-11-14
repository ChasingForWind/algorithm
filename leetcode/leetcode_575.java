package leetcode;

import java.util.HashSet;

public class leetcode_575 {
    class Solution {
        public int distributeCandies(int[] candies) {
            HashSet<Integer> set = new HashSet<>();
            for (int i= 0;i<candies.length;i++){
                set.add(candies[i]);
            }
            return Math.min(candies.length/2,set.size());
        }

    }
}
