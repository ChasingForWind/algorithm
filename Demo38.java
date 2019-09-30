public class Demo38 {
    /*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
    由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。*/
    public class Solution {
        public int MoreThanHalfNum_Solution(int[] array) {
            //代码鲁棒性
            if (array == null || array.length <= 0) return 0;
            //定义士兵种类和个数
            int number = 1;
            int soldier = array[0];
            //循环开始士兵守阵地，当士兵个数为0时，士兵赋值为下一个士兵个数加一
            for (int i = 1; i < array.length; i++) {
                if (number == 0) {
                    soldier = array[i];
                    number = 1;
                    continue;
                }
                if (soldier == array[i]) number++;
                else number--;
            }
            int time = 0;
            //for循环检查最后剩下的士兵在数轴中的个数
            for (int j = 0; j < array.length; j++) {
                if (array[j]==soldier) time++;
            }
            //进行判断
            if (time*2>array.length) return soldier;
            else return 0;
        }
    }

}
