public class 隐藏关卡48 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //代码鲁棒性
            if (s.length() <= 0 || s == null) return 0;
            s = s.trim();
            if (s.length()==0) return 0;
            if (s.length() == 1) return 1;

            //定义一个数组存放上个字符出现位置
            int[] ints = new int[128];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = -1;
            }
            //定义dp数组
            int[] dp = new int[s.length()];
            dp[0] = 1;
            ints[s.charAt(0)-' '] = 0;
            //循环
            for (int j = 1; j < s.length(); j++) {
                int index = s.charAt(j)-' ';
                if (ints[index]<0){
                    dp[j] = dp[j-1]+1;
                    ints[index] = j;
                }else {
                    int d = j-ints[index];
                    ints[index] = j;
                    if (d<=dp[j-1]) dp[j] = d;
                    else dp[j] = dp[j-1]+1;
                }
            }
            //在dp数组中选择最大值
            int max = 0;
            //返回
            for (int i = 0; i < dp.length; i++) {
                if (dp[i]>max)
                    max = dp[i];
            }
            return max;
        }
    }
}
