import java.util.HashMap;

public class demo {
    static class Solution{
        public int[] twoSum(int[] nums,int target){
            HashMap<Integer, Integer> map = new HashMap<>();
            int a = -1;
            int b = -1;
            for (int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])) map.put(target-nums[i],i);
                else {
                    a = map.get(nums[i]);
                    b = i;
                    break;
                }
            }
            int[] res = new int[2];
            res[0] = a;
            res[1] = b;
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Solution solution = new Solution();
        int[] res = solution.twoSum(nums, 9);
        System.out.println(res[0]+" "+res[1]);
    }
}
