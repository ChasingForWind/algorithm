public class 面试题39_解法2 {
    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            //代码鲁棒性
            if (array==null||array.length<=0) return 0;
            //定义开头和结尾
            int start = 0;
            int end = array.length-1;
            int index = 0;
            int mid = array.length/2;
            //while循环
            while (index!=mid){
                index = Partrition(array, start, end);
                if (index<mid){
                    start = index+1;
                }else {
                    end = index-1;
                }
            }
            //判断验证合法性
            int time = 0;
            int num = array[index];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num){
                    time++;
                }
            }
            if (time>array.length/2) return num;
            else return 0;
        }
        public int Partrition(int[] array,int start,int end){
            int l = start-1;
            int index = start;
            while (index<end){
                if (array[index]<array[end]){
                    l++;
                    swap(array,index,l);
                    index++;
                }else {
                    index++;
                }
            }
            swap(array,end,l+1);
            return l+1;
        }
        public void swap(int[] array,int index1,int index2){
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}
