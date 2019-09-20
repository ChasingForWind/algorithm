public class Demo35 {
    /*统计一个数字在排序数组中出现的次数。*/
    /*菜鸟的解法*/
    public class Solution {
        public int GetNumberOfK(int[] array, int k) {
            //代码的鲁棒性
            if(array.length==0) return 0;
            //定义相关变量
            int count = 0;
            //遍历直到找到第一个数字
            for (int i = 0; i < array.length; i++) {
                if (k==array[i]){
                    count++;
                    //找这个数字的下一个数字
                    //如果是则count++
                    while((i+1)<array.length&&array[i+1]==k){
                        count++;
                        i++;
                    }
                    return count;
                }
            }
            return count;
        }
    }
}
