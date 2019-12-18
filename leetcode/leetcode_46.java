package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class leetcode_46 {
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            if (nums.length==0) return result;
            LinkedList<Integer> num = new LinkedList<>();
            LinkedList<Integer> smallNum = new LinkedList<>();
            for (int i=0;i<nums.length;i++){
                num.add(nums[i]);
            }
            getResult(num,smallNum);
            return result;
        }
        public void getResult(LinkedList<Integer> num,LinkedList<Integer> smallNum){
            if (smallNum.size()==num.size()){
                result.add(new LinkedList<>(smallNum));
                return;
            }
            for (int i=0;i<num.size();i++){
                if(smallNum.contains(num.get(i))) continue;
                smallNum.add(num.get(i));
                getResult(num,smallNum);
                smallNum.remove(num.get(i));
            }
        }
    }
}
