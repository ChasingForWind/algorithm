import java.util.ArrayList;
public class 面试题58 {

    public class Solution {
        public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
            //初始化
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int small = 1;
            int big = 2;
            //while滑动
            while (small<=sum/2){
                //大于sum
                if (Sum(small,big)>sum){
                    small++;
                }else if (Sum(small,big)<sum){//小于sum
                    big++;
                }else {//等于sum
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int i=small;i<=big;i++){
                        temp.add(i);
                    }
                    res.add(temp);
                    big++;
                }
            }
            //输出
            return res;
        }
        //写个求和函数
        public int Sum(int small,int big){
            return (small+big)*(big-small+1)/2;
        }
    }
}
