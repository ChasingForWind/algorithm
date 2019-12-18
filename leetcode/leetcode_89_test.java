package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_89_test {
    public static void main(String[] args) {
        System.out.println(grayCode(2));

    }
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(0);
        dp.add(first);
        if (n==0) return dp.get(0);
        for (int i=1;i<=n;i++){
            ArrayList<Integer> temp = dp.get(i - 1);
            int length = temp.size();
            for (int j=length-1;j>=0;j--){
                temp.add(temp.get(j)+(int)Math.pow(2,i-1));
            }
            dp.add(temp);
        }
        return dp.get(n);
    }
}
