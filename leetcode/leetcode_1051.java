package leetcode;

public class leetcode_1051 {
    class Solution {
        public int heightChecker(int[] heights) {
            //先在数轴上表示对应的数字有几个
            int[] arr = new int[101];
            for (int height : heights) {
                arr[height]++;
            }
            int count = 0;
            for (int i = 1,j = 0; i < arr.length; i++) {
                while (arr[i]!=0){
                    if (heights[j]!=i){
                        count++;
                    }
                    j++;
                    arr[i]--;
                }
            }
            return count;
        }
    }
}
