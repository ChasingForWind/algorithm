public class 面试题60_解法2桶排思维 {
    public class Solution {
        public boolean isContinuous(int [] numbers) {
            if (numbers.length==0||numbers==null) return false;
            int[] array = new int[14];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]==0) continue;
                if (array[numbers[i]]!=0) return false;
                else {
                    if (numbers[i]>max){
                        max = numbers[i];
                        array[numbers[i]]=1;
                        //continue;
                    }
                    if (numbers[i]<min) {
                        min = numbers[i];
                        array[numbers[i]]=1;
                       // continue;
                    }

                }
            }
            if ((max-min)>4) return false;
            else return true;
        }
    }
}
