public class 面试题42 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            if (array==null||array.length<0) return 0;
            //维护一个count,max.index
            int count = 0;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (count<0) count=0;
                count = count+array[i];
                if (count>max){
                    max = count;
                }
            }
            return max;
        }
    }
}
