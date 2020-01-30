import java.util.ArrayList;
public class 面试题59 {
    public class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
            //初始化
            ArrayList<Integer> res = new ArrayList<>();
            int small = 0;
            int big = array.length-1;
            //开始循环，终止条件是两个指针相等
            while (small<big){
                //小于sum
                if (array[small]+array[big]<sum){
                    small++;
                }else if (array[small]+array[big]>sum){//大于sum
                    big--;
                }else { //等于sum
                    res.add(array[small]);
                    res.add(array[big]);
                    break;
                }
            }
            //返回
            return res;
        }
    }
}
