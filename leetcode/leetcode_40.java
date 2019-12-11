package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_40 {
    class Solution {
        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> list = new ArrayList<>();
            Arrays.sort(candidates);
            TrackBack(candidates, target, list, 0);
            return result;
        }

        public void TrackBack(int[] candidates, int target, List list, int i) {
            if (target == 0) {
                result.add(new ArrayList<>(list));
                return;
            }
            if (target < 0) {
                return;
            }
            for (int start = i; start < candidates.length; start++) {
                if (target < candidates[start]) break;
                if (start>i&&candidates[start]==candidates[start-1]) break;
                list.add(candidates[start]);
                TrackBack(candidates, target - candidates[start], list, i++);
                list.remove(list.size() - 1);
            }
        }
    }
}
