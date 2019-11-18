package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class leetcode_239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length - k+1];
            if (nums==null||k<1||nums.length<1) return new int[0];
            int index = 0;
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i=0;i<nums.length;i++){
                while (!list.isEmpty()&&nums[i]>=nums[list.peekLast()]){
                    list.pollLast();
                }
                list.addLast(i);
                if (list.peekFirst()==i-k) list.pollFirst();
                if (i>=k-1){
                    res[index] = nums[list.peekFirst()];
                    index++;
                }
            }
            return res;
        }
    }
}
