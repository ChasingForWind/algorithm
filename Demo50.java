public class Demo50 {
    /*在一个长度为n的数组里的所有数字都在0到n-1的范围内。
    数组中某些数字是重复的，但不知道有几个数字是重复的。
    也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
    例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
    那么对应的输出是第一个重复的数字2。*/
    public class Solution {
        public boolean duplicate(int numbers[],int length,int [] duplication) {
            //代码鲁棒性
            if (numbers == null || length == 0) {
                return false;
            }
            //边界问题，保证所有数字是在 0 到 n-1 之间
            //进行for循环
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= length || numbers[i] < 0) {
                    return false;
                }
            }
            for (int j = 0; j < length; j++) {
                //如果出现number[i]==number[number[i]]的情况说明出现重复数字
                while (numbers[j] != j) {
                    if (numbers[j] == numbers[numbers[j]]) {
                        duplication[0] = numbers[j];
                        //赋值返回true
                        return true;
                    }
                    //否则寻找所在位置的索引进行交换
                    int temp = numbers[j];
                    numbers[j] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
            return false;
        }
    }
}
