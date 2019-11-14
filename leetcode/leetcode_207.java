package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_207 {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            //创建一个一维数轴，对应的是课程和需要入度元素
            int[] indegree = new int[numCourses];
           for (int[] cp:prerequisites){
               indegree[cp[0]]++;
           }
            //创建一个队列
            Queue<Integer> queue = new LinkedList<>();
            //把入度为零的点全部放进去
            for (int i=0;i<indegree.length;i++){
                if (indegree[i]==0){
                    queue.add(i);
                }
            }
            //当队列不为零时
            while (!queue.isEmpty()){
                Integer temp = queue.poll();
                numCourses--;
                for (int[] req:prerequisites){
                    if (req[1]!=temp) continue;
                    if (--indegree[req[0]]==0) queue.add(req[0]);
                }
            }
            return numCourses==0;
            //弹出队首元素
            //numcourse--
            //将队首元素对应的入度减1
            //如果减去之后入度为零，则将其入队
        }
    }
}
