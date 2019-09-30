import java.util.Arrays;
import java.util.Comparator;

public class Demo49 {
    /*输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
    打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/


    public class Solution {
        public String PrintMinNumber(int[] numbers) {
            //代码鲁棒性
            if (numbers.length == 0 || numbers == null) return "";
            //定义一个string类型的数组
            String[] strings = new String[numbers.length];
            //定义一个stringbuilder
            StringBuilder sb = new StringBuilder();
            //将整数类型的数组转换成字符类型的数组
            for (int i = 0; i < numbers.length; i++) {
                strings[i] = String.valueOf(numbers[i]);
            }
            //调用Arrays中的sort方法进行排序，重写Comparetor比较器
            Arrays.sort(strings, new Comparator<String>() {
                @Override
                //定义比较器方法，先将两个字符拼接，再进行比较
                public int compare(String s1, String s2) {
                    String c1 = s1 + s2;
                    String c2 = s2 + s1;
                    return c1.compareTo(c2);
                }
            });
            //比较结束将字符类型的数组拼接成stringbuilder类型进行返回
            for (int j = 0; j < numbers.length; j++) {
                sb.append(strings[j]);
            }
            return sb.toString();
        }
    }
}
