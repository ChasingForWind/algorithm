public class Demo16_1 {
    /*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
    所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
    public class Solution {
        public void reOrderArray(int [] array) {
            //冒泡算法两层循环
            for (int i=0;i<array.length;i++){
                for (int j=array.length-1;j>i;j--){
                    //如果前面是偶数后面是奇数就交换
                    if (array[j-1]%2==0&&array[j]%2!=0){
                        int temp;
                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }
}
