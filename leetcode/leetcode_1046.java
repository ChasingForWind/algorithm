package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode_1046 {
    public int lastStoneWeight(int[] stones) {
        //创建堆的结构
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        //将数组元素入堆
        for (int i = 0;i<stones.length;i++){
            heap.offer(stones[i]);
        }
        //判断堆的长度是否大于1
        while (heap.size()>1){
            //如果大于1则选出最大的两个想减
            Integer x = heap.poll();
            Integer y = heap.poll();
            //结果入堆
            if ((x-y)!=0)
            heap.offer(x-y);
        }
        //返回0或者堆首元素
        return heap.isEmpty()?0:heap.peek();
    }
}
