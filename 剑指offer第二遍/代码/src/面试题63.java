import java.util.LinkedList;

public class 面试题63 {
    //模拟小朋友唱歌
    public class Solution {
        public int LastRemaining_Solution(int n, int m) {
            LinkedList<Integer> list = new LinkedList<>();
            //添加数字
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            //循环模拟
            int base = 0;
            while (list.size()>1){
                base = (base+m-1)%list.size();
                list.remove(base);
            }
            //返回数字
            return list.size()==1? list.getFirst():-1;
        }
    }
}
