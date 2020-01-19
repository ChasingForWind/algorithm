public class 面试题43 {
    public class Solution {
        int count = 0;
        public int NumberOf1Between1AndN_Solution(int n) {
            for (int i = 1; i <= n; i++) {
                getCount(i);
            }
            return count;
        }
        public void getCount(int i){
            while (i!=0){
                if (i%10==1) count++;
                i=i/10;
            }
        }
    }
}
