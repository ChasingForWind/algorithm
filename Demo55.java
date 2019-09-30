import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo55 {
    /*给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
    例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
    他们的最大值分别为{4,4,6,6,6,5}；
    针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
    {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
    {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。*/
    /*思路就是采用双端队列，队列中的头节点保存的数据比后面的要大。
          比如当前假如的数据比队尾的数字大，说明当前这个数字最起码在从现在起到后面的过程中可能是最大值
          ，而之前队尾的数字不可能最大了，所以要删除队尾元素。
          此外，还要判断队头的元素是否超过size长度，由于存储的是下标，所以可以计算得到；
          特别说明，我们在双端队列中保存的数字是传入的向量的下标；
        */
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size) {
            //创建一个arraylist数组作为以后的返回值
            ArrayList<Integer> list = new ArrayList<Integer>();
            //代码鲁棒性判断
            if (num == null || num.length == 0 || size == 0 || size > num.length) return list;
            //创建一个队列作为辅助数据结构
            Deque<Integer> deque = new LinkedList<Integer>();
            //开始for循环
            for (int i = 0; i < num.length; i++) {
                //判断队列是否为空，如果为空，直接入队
                if (!deque.isEmpty()){
                    //如果不为空
                    //判断队列首元素是否已经出窗口
                    if ((deque.peek() + size) <= i) {
                        deque.pop();
                    }
                    //进入之后判断等待入队的元素和队尾元素的大小关系，如果比队尾元素大，删除队尾元素，知道遇到比自己大的队尾元素或者队列为空
                    while (!(deque.isEmpty())&&num[i] > num[deque.getLast()]) {
                        deque.removeLast();
                    }
                }
                //入队
                deque.offer(i);
                //经过一个窗口的大小，开始向list中写入元素
                if (i + 1 >= size) {
                    list.add(num[deque.peek()]);
                }
            }
            return list;
        }
    }
}
