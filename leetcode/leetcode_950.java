package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_950 {
    class Solution {
        public int[] deckRevealedIncreasing(int[] deck) {
            //将deck进行排序
            Arrays.sort(deck);
            //建立一个队列存放deck数组下标
            Queue<Integer> index = new LinkedList<>();
            for (int i =0;i<deck.length;i++){
                index.add(i);
            }
            //建立一个ans数组准备存放结果
            int[] ans = new int[deck.length];
            //遍历数组ans
            for (int card : deck){
                ans[index.poll()] = card;
                //对其进行赋值运算
                if (!index.isEmpty()){
                    index.add(index.poll());
                }
            }
            return ans;
            //返回结果
        }
    }
}
