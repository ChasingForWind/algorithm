import java.util.Comparator;
import java.util.PriorityQueue;

public class 面试题41 {
    public class Solution {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>(){ //大顶堆，容量11
            @Override
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        });
        //记录奇数偶数
        int count = 0;

        public void Insert(Integer num) {
            if (count%2==1){
                minHeap.add(num);
                Integer poll = minHeap.poll();
                maxHeap.add(poll);
                count++;
            }
            else {
                maxHeap.add(num);
                Integer poll = maxHeap.poll();
                minHeap.add(poll);
                count++;
            }
        }
        public Double GetMedian() {
            if (count%2==0){
                return (double) (maxHeap.peek() + minHeap.peek()) /2;
            }else {
                return (double) minHeap.peek();
            }
        }
        }

}
