public class 面试题75 {
    /*字符串转换成整数*/
    public class Solution {
        public int StrToInt(String str) {
            //代码鲁棒性
            if (str == null || str.length() == 0) return 0;
            char[] chars = str.toCharArray();
            //处理正负号
            int symbol=1;
            int start = 0;
            if (chars[0] == '+') {
                start = 1;
            } else if (chars[0] == '-') {
                start = 1;
                symbol = 1;
            }
            //变成字符数组进行遍历
            long result=0;
            long max= Integer.MAX_VALUE;
            //long min = Integer.MIN_VALUE;
            for (int i=start;i<chars.length;i++){
                if (chars[i]>'9'||chars[i]<'0') return 0;

                result = result*10 + (chars[i]-'0');
                if (symbol==1&&result>max) return 0;
                if (symbol==-1&&result>max+1) return 0;
            }
            //输出
            return symbol*(int)result;
        }
    }
}
