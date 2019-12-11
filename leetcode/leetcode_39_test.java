/*package leetcode;

import java.util.LinkedList;
import java.util.List;

public class leetcode_39_test {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        combinationSum(candidates,target);
    }
    static List<List<Integer>>  linkedLists = new LinkedList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new LinkedList<>();
        findList(candidates,target,list);
        return linkedLists;
    }
    public static void findList(int[] candidates,int target,List<Integer> list){
        if (target==0){
            linkedLists.add(list);
        }
        if (target<0){
            list.remove();
            return;
        }
        for (int i=0;i<candidates.length;i++){
            list.add(candidates[i]);
            findList(candidates,target-candidates[i],list);
        }
    }
}*/
