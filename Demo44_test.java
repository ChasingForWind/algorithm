import java.util.ArrayList;

public class Demo44_test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = FindContinuousSequence(100);
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
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
                for (int j = plow; j < phigh; j++) {
                    list.add(j);
                }
                lists.add(list);
            }
            //如果不相等则判断大小
            //小 则右边指针移动一个
            if (temp_sum<sum) phigh++;
            //大 则左边指针移动一个
            if (temp_sum>sum) plow++;
        }
        return lists;
    }
}
