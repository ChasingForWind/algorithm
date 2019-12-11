package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcode_39 {
    class Solution {
        List<List<Integer>> linkedLists = new LinkedList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<Integer> list = new LinkedList<>();
            Arrays.sort(candidates);
            findList(candidates,target,list,0);
           return linkedLists;
        }
        public void findList(int[] candidates,int target,List<Integer> list,int i){
            if (target==0){
                linkedLists.add(new ArrayList<>(list));
                return;
            }
            if (target<0){
                return;
            }
            for (int start=i;start<candidates.length;start++){
                if (target<candidates[start]) break;
                list.add(candidates[start]);
                findList(candidates,target-candidates[start],list,start);
                list.remove(list.size()-1);
            }
        }
    }
}
