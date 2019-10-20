package leetcode;

public class leetcode_942 {
    class Solution {
        public int[] diStringMatch(String S) {
            int lower = 0;
            int higher = S.length();
            //创建一个数组来存放结果
            int[] arr = new int[S.length() + 1];
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'I') {
                    arr[i] = lower;
                    lower ++;
                } else {
                    arr[i] = higher;
                    higher --;
                }
            }
            arr[S.length()] = lower;
            return arr;
        }
    }
}
