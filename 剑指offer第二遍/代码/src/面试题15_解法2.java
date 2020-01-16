public class 面试题15_解法2 {
    public class Solution {
        public int NumberOf1(int n) {
            int count = 0;
            while (n!=0){
                n=(n-1)&n;
                count++;
            }
            return count;
        }
    }
}
