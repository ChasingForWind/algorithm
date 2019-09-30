import java.util.ArrayList;

public class Demo45 {
    /*输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    如果有多对数字的和等于S，输出两个数的乘积最小的。*/
    public class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
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
}
