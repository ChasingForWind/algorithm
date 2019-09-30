public class Demo51 {
    /*汇编语言中有一种移位指令叫做循环左移（ROL），
    现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
    对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
    例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
    即“XYZdefabc”。是不是很简单？OK，搞定它！*/
    public class Solution {
        public String LeftRotateString(String str,int n) {
            //代码鲁棒性
            if(str.length()<=0||n<0||str==null){
                return null;
            }
            n = n % str.length();
            //用substring截取前一半
            StringBuilder sb1 = new StringBuilder(str.substring(0, n));
            //用substring截取后一半
            StringBuilder sb2 = new StringBuilder(str.substring(n, str.length()));
            //拼接
            sb1.append(sb2);
            return sb1.toString();
        }
    }
}
