public class 面试题65 {
    public class Solution {
        public int Add(int num1,int num2) {
            //定义两个数，一个是进位一个是原位
            int k = num1^num2; //原位
            int j = (num1&num2)<<1; //进位
            while (j!=0){
                int temp = k^j;
                j =  (k&j)<<1;
                k = temp;
            }
            return k;
        }
    }
}
