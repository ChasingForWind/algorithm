import java.io.FileInputStream;
import java.util.ArrayList;

public class Demo45_test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 7;
        ArrayList<Integer> integers = FindNumbersWithSum(array, sum);
        System.out.println(integers);
    }
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        //代码的鲁棒性，当长度为0时返回null
        if (array.length==0) return list;
        //设置两个指针
        int plow = 0;
        int phigh = array.length-1;
        //开始while循环，循环的条件时plow<phigh
        while(plow<phigh){
            if ((array[plow]+array[phigh])==sum) {
                list.add(array[plow]);
                list.add(array[phigh]);
                break;
            }
            else if((array[plow]+array[phigh])<sum) plow++;
            else phigh--;
        }
        //返回
        return list;
    }
}
