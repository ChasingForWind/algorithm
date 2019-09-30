import java.util.ArrayList;

public class Demo44 {
    /*小明很喜欢数学,有一天他在做数学作业时,
    要求计算出9~16的和,他马上就写出了正确答案是100。
    但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
    没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
    现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

    输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序*/

    public class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            //简历返回集合
            ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
            //建立窗口指针
            int plow = 1;
            int phigh = 2;
            //while循环遍历
            while (plow < phigh) {
                //进行判断如果相等则遍历，并将所得到的集合加入返回集合
                int temp_sum = (phigh + plow) * (phigh - plow + 1) / 2;
                if (temp_sum == sum) {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    for (int j = plow; j <=phigh; j++) {
                        list.add(j);
                    }
                    lists.add(list);
                    plow++;
                }
                //如果不相等则判断大小
                //小 则右边指针移动一个
                else if (temp_sum<sum) phigh++;
                //大 则左边指针移动一个
                else  plow++;
            }
            return lists;
        }
    }
}
