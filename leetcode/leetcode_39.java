package leetcode;

import java.util.LinkedList;
import java.util.List;

public class leetcode_39 {
    class Solution {
        List<List<Integer>> linkedLists = new LinkedList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<Integer> list = new LinkedList<>();
            findList(candidates,target,list);
           return linkedLists;
        }
        public void findList(int[] candidates,int target,List<Integer> list){
            if (target==0){
                linkedLists.add(list);
            }
            if (target<0){
                list.clear();
                return;
            }
            for (int i=0;i<candidates.length;i++){
                findList(candidates,target-candidates[i],list);
            }
        }
    }
}
