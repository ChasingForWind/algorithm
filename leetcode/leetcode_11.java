package leetcode;

public class leetcode_11 {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length-1;
            int area=0;
            int min=0;
            while (left<right){
                min = Math.min(height[left],height[right]);
                if ((right-left)*min>area) area=(right-left)*min;
                if (height[right]>=height[left]) right--;
                else left++;
            }
            return area;
        }
    }
}
