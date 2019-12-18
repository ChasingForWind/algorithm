package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode_47 {
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> permuteUnique(int[] nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            ArrayList<Integer> num = new ArrayList<Integer>();
            Arrays.sort(nums);
            for (int i=0;i<nums.length;i++){
                num.add(nums[i]);
            }
            int[] index = new int[num.size()];
            trackBack(num,temp,index);
            return result;
        }

        public void trackBack(ArrayList<Integer> num,ArrayList<Integer> temp,int[] index){
            if (temp.size()==num.size()){
                result.add(new ArrayList<>(temp));
                return;
            }
            for (int i=0;i<num.size();i++){
                if (index[i]==1) continue;
                temp.add(num.get(i));
                index[i]=1;
                trackBack(num,temp,index);
                temp.remove(num.get(i));
                index[i]=0;
            }
        }
    }
}
