package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class leetcode_496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[nums1.length];
            for (int i=0;i<nums2.length;i++){
                if (stack.isEmpty()){
                    stack.push(nums2[i]);
                }
                Integer peek = stack.peek();
                while (peek<nums2[i]){
                    map.put(peek,nums2[i]);
                    stack.pop();
                    if (!stack.isEmpty()){
                        peek=stack.peek();
                    }else{
                        break;
                    }
                }
                stack.push(nums2[i]);
            }
            for (int j=0;j<nums1.length;j++){
                if (map.get(nums1[j])==null) res[j]=-1;
                else res[j] = map.get(nums1[j]);
            }
            return res;
        }
    }
}
