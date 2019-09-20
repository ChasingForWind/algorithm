public class Demo21_test {
    static int index = 0;
    public static void main(String[] args) {
        char[] ch = {'1','.','2','.','1'};
        System.out.println(isNumeric(ch));
    }

    public static boolean isNumeric(char[] str) {
        //当str长度小于1时返回null
        if (str.length<1) return false;
        //调用isNumber函数
        return isNumber(str);
    }
    //isNumber函数
    public static boolean isNumber(char[] str){
        //定义index变量

        //定义flag标志
        boolean flag = scanInterger(str);
        //如果遇到‘.’的情况
        if (index<str.length&&str[index]=='.'){
            index++;
            flag = scanUsignedInteger(str)||flag;
        }
        //如果遇到‘E’或‘e’的情况
        if (index<str.length&&(str[index]=='E'||str[index]=='e')){
            index++;
            flag = scanInterger(str)&&flag;
        }
        return flag&&(index==str.length);
    }
    //scanInterger函数
    public static boolean scanInterger(char[] str){
        //如果遇到‘+’‘-’则index++
        if (index<str.length&&(str[index]=='+'||str[index]=='-')){
            index++;
        }
        //跳转到无符号判断
        return scanUsignedInteger(str);
    }
    //scanUsignedInteger函数
    public static boolean scanUsignedInteger(char[] str){
        //定义start等于index
        int start = index;
        //当index满足0到9之间时index加一
        while (index<str.length&&(str[index]>='0'&&str[index]<='9')){
            index++;
        }
        //返回start和index的大小比较，start小于index返回true
        return start<index;
    }
}
