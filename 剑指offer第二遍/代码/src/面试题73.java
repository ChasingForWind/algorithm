import java.util.ArrayDeque;
import java.util.ArrayList;


public class 面试题73 {
    /*滑动窗口最大值*/
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size)
        {
            //鲁棒性
            //维持一个begin
            //维持一个queue
            //维持一个arraylist 的结果集
            ArrayList<Integer> res = new ArrayList<>();
            if (size==0) return res;
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            int begin;
            //循环
            for (int i = 0; i < num.length; i++) {
                begin = i-size+1;
                if (queue.isEmpty()) queue.add(i);
                else {
                    if (begin>queue.peekFirst()) queue.pollFirst();
                    while (!queue.isEmpty()&&num[i]>num[queue.peekLast()]){
                        queue.pollLast();
                    }
                    queue.add(i);
                }
                if (begin>=0)  res.add(num[queue.peekFirst()]);
            }
            return res;
            //为空直接加入
            //如果begin>队列头坐标，队列头提出
            //循环判断到将所有下于插入值的队列中的数字剔除
            //插入数字
            //往结果集中插入数字
            //返回结果
        }
    }
}
