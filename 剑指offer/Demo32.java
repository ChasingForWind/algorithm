public class Demo32 {
    /*num1,num2分别为长度为1的数组。传出参数
       将num1[0],num2[0]设置为返回结果*/
    public class Solution {
        public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            //代码的鲁棒性
            if (array.length < 2) return;
            if (array.length==2){
                num1[0] = array[0];
                num2[0] = array[1];
            }
            int result = 0;
            //将全体数字进行异或运算
            for (int i = 0; i < array.length; i++) {
                result ^= array[i];
            }
            int index = findFirst(result);
            for (int j = 0; j < array.length; j++) {
                if (isBit(array[j], index)) {
                    num1[0] ^= array[j];
                } else {
                    num2[0] ^= array[j];
                }
            }

        }

        //寻找位中右起第一个为1的位
        public int findFirst(int num) {
            int index = 0;
            while ((num & 1) != 1 && index < 32) {
                num >>= 1;
                index++;
            }
            return index;
        }

        //判断是否index位为1
        public boolean isBit(int num, int index) {
            num >>= index;
            if ((num & 1) == 1) return true;
            return false;
        }
    }
}
