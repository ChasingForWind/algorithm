import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 面试题40_最大堆 {
    public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> res = new ArrayList<>();
            if (input==null||input.length<0||k<=0||input.length<k) return res;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){ //大顶堆，容量11
                @Override
                public int compare(Integer i1,Integer i2){
                    return i2-i1;
                }
            });
            for (int i = 0; i < input.length; i++) {
                if (maxHeap.size()<k){
                maxHeap.add(input[i]);
                }
                else {
                    //如果堆中最大的一位小于此数
                    if (maxHeap.peek()<=input[i]) continue;
                    else {
                        maxHeap.poll();
                        maxHeap.add(input[i]);
                    }
                }
            }
            for (int i = 0; i < k; i++) {
                res.add(maxHeap.poll());
            }
            return res;
            }
        }
    }