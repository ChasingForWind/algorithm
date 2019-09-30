import java.util.Arrays;
import java.util.Comparator;

public class Demo49_test {
    public static void main(String[] args) {
        int[] numbers = {4,2,3};
        String s = PrintMinNumber(numbers);
        System.out.println(s);
    }
    public static String PrintMinNumber(int[] numbers) {
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
        for (int j =0;j<numbers.length;j++){
            sb.append(strings[j]);
        }
        return sb.toString();
    }
}

