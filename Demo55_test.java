import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Demo55_test {
    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        ArrayList<Integer> integers = maxInWindows(num, 3);
        System.out.println(integers);
    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
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
