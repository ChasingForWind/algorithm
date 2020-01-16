public class 面试题14_动态规划 {
    public class Solution {
        public int cutRope(int target) {
            if (target<2) return 0;
            if (target==2) return 1;
            if (target==3) return 2;

            int[] result = new int[target + 1];

            result[1] = 1;
            result[2] = 2;
            result[3] = 3;
            for (int i=4;i<=target;i++){
                int max =0;
                for (int j=0;j<=i/2;j++){
                    if (result[j]*result[i-j]>max){
                        max = result[j]*result[i-j];
                    }
                }
                result[i] = max;
            }
            return result[target];
        }
    }
}
