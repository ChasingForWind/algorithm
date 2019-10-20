package leetcode;

public class leetcode_771 {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            if (J==null||S==null) return 0;

            char[] Jewels = J.toCharArray();
            char[] Stones = S.toCharArray();
            int count = 0;
            for (int i=0;i<Jewels.length;i++){
                for (int j=0;j<Stones.length;j++){
                    if (Jewels[i]==Stones[j]) count++;
                }
            }
            return count;
        }
    }
}
