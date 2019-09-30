import java.util.LinkedList;

public class Demo52_test {
    public static void main(String[] args) {
        int i = LastRemaining_Solution(10, 3);
        System.out.println(i);
    }
    public static int LastRemaining_Solution(int n, int m) {
        //代码鲁棒性 n < 0 或 m <= 0 返回 -1
        if (n < 0 || m <= 0) return -1;
        //建立一个linkedlist集合，将小朋友编号放入
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        //判断条件当集合里的数字大于1时
        int p = 0;
        while (list.size() > 1) {
            //核心判断代码  p = (p+m-1)%list.length;
            p = (p + m - 1) % list.size();
            //从集合中删除p
            list.remove(p);
        }
        return list.size()==1? list.get(0):-1;
    }
}
