import java.util.ArrayList;

public class Demo36 {
    /*把只包含质因子2、3和5的数称作丑数（Ugly Number）。
    例如6、8都是丑数，但14不是，因为它包含质因子7。
    习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。*/
    public class Solution {
        public int GetUglyNumber_Solution(int index) {
            //代码鲁棒性当index<=0时返回0；
            if(index<=0) return 0;
            //创建数组
            ArrayList<Integer> list = new ArrayList<Integer>();
            //让数组第一个为1
            list.add(1);
            //创建T2 T3 T5三个指针初始值为0；
            int T2 = 0;
            int T3 = 0;
            int T5 = 0;
            //循环当count<index时
            while (list.size()<index){
                //找到3个数的最小值
                int min = Math.min(list.get(T2)*2,Math.min(list.get(T3)*3,list.get(T5)*5));
                //向数组内添加最小值
                list.add(min);
                //跟新指针
                if (list.get(T2)*2==min) T2++;
                if (list.get(T3)*3==min) T3++;
                if (list.get(T5)*5==min) T5++;
            }
            return list.get(list.size()-1);
        }
    }
}
