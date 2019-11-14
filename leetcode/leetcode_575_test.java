package leetcode;

import java.util.HashSet;

public class leetcode_575_test {
    public static void main(String[] args) {
        int[] num = {1,1,1,1,2,2,2,3,3,3};

        System.out.println(distributeCandies(num));
    }
    public static int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i= 0;i<candies.length;i++){
            set.add(i);
        }
        return Math.min(candies.length/2,set.size());
    }
}
