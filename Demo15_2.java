/*输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/
/*第二种操作*/
public class Demo15_2 {
    public class Solution {
        public int NumberOf1(int n) {
           int count=0;
           while (n!=0){
               n = (n-1)&n;
               count++;
           }
           return count;
        }
    }
}