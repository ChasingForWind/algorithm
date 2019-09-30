public class Demo48 {
    /*将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
    但是string不符合数字要求时返回0)，
    要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。*/
    public class Solution {
        public int StrToInt(String str) {
            //代码鲁棒性：str ==null 和 str.length ==0
            if (str == null || str.length() == 0||str.trim().equals("")) {
                return 0;
            }
            //分割字符串
            char[] chars = str.trim().toCharArray();
            int symbol = 0;
            int start = 0;
            //判断正负数和起始位置
            if (chars[0] == '+') {
                symbol = 0;
                start = 1;
            } else if (chars[0] == '-') {
                symbol = 1;
                start = 1;
            }

            //进行循环
            //定义result=0为返回结果
            int result = 0;
            for (int i = start; i < chars.length; i++) {
                //循环内判断是否是0到9的数字
                if (chars[i] < '0' || chars[i] > '9') return 0;

                //定义一个函数判断是否越界
                int sum = result * 10 + (int) (chars[i] - '0');
                if ((sum - (int) (chars[i] - '0'))/10 != result) return 0;

                //如果没有越界则赋值继续
                result = result * 10 + (int) (chars[i] - '0');
            }
            //返回result
            // result = (int) Math.pow(-1, symbol) * result;
            //        return result;
            result = (int)Math.pow(-1,symbol)*result;
            return result;
        }
    }
}

