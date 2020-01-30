import java.util.HashMap;

public class 面试题60 {
    //扑克牌顺子
    public class Solution {
        public boolean isContinuous(int [] numbers) {
            if (numbers==null||numbers.length==0) return false;
            //使用hashmap
            HashMap<Integer, Integer> map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]<min&&numbers[i]!=0) min = numbers[i];
                if (numbers[i]>max) max = numbers[i];
                if (!map.containsKey(numbers[i])) map.put(numbers[i],1);
                else if (numbers[i]!=0&&map.get(numbers[i])==1) return false;

                //if (numbers[i]!=0&&map.get(numbers[i])==1) return false;
                //map.put(numbers[i],1);
            }
            //1.最大值与最小值的差大于4
            //2.除0外的数字重复出现
            if (max-min>4) return false;
            return true;
        }
    }
}
