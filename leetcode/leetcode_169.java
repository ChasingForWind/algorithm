package leetcode;

import java.util.HashMap;

public class leetcode_169 {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int res=nums[0];
            for (int i=0;i<nums.length;i++){
                if (map.containsKey(nums[i])){
                    int temp = map.get(nums[i]);
                    temp++;
                    if (temp>nums.length/2){
                        res = nums[i];
                        return res;
                    }
                    map.put(nums[i],temp);
                    continue;
                }
                map.put(nums[i],1);
            }
            return res;
        }
    }
}
