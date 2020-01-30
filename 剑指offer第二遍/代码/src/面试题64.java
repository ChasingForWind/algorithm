public class 面试题64 {
    public class Solution {
        /*非常规求两数和*/
        public int Sum_Solution(int n) {
            if (n==0) return 0;
            return n+Sum_Solution(n-1);
        }
    }
}
