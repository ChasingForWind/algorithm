public class 面试题70 {
    /*二进制中1的个数*/
    public class Solution {
        public int NumberOf1(int n) {
            int count = 0;
            while (n!=0){
                if ((n&1)==1) count++;
                n=n>>>1;
            }
            return count;
        }
    }
}
