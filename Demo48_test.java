public class Demo48_test {
    public static void main(String[] args) {
        String s = "-1997";
        int i = StrToInt(s);
        System.out.println(i);
    }
    public static int StrToInt(String str) {
        //代码鲁棒性：str ==null 和 str.length ==0
        if (str == null || str.length() == 0) {
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
        result = (int)Math.pow(-1,symbol)*result;
        return result;
    }
}
