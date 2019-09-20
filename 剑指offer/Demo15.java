/*输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/
public class Demo15 {
    public class Solution {
        public int NumberOf1(int n) {
            int flag=1;
            int count=0;
            while (flag!=0){
                if((n&flag)!=0){
                    count++;
                }
                flag = flag << 1;
            }
            return count;
        }
    }
}
