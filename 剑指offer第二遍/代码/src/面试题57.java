import java.util.ArrayList;

public class 面试题57 {
    public class Solution {
        public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            //找出两个数的异或值
            int temp = 0;
            for (int i = 0; i < array.length; i++) {
                temp = array[i] ^ temp;
            }
            //找到第一个不为0的数
            int check = 1;
            while ((check & temp) == 0) {
                check = check << 1;
            }
            //分组
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if ((check & array[i]) == 0) array1.add(array[i]);
                else array2.add(array[i]);
            }
            //再次异或
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < array1.size(); i++) {
                count1 = count1^array1.get(i);
            }
            for (int i = 0; i < array2.size(); i++) {
                count2 = count2^array2.get(i);
            }
            //赋值输出
            num1[0] =count1;
            num2[0] =count2;
        }
    }
}
