package leetcode;

public class leetcode_985 {
    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            //定义一个s
            int s = 0;
            int[] res = new int[queries.length];
            //第一个循环for得到数轴中的偶数和s
            for (int i=0;i<A.length;i++){
                if ((A[i]%2)==0){
                    s+=A[i];
                }
            }
            //第二个循环,把A中对应数字拎出来
            //加上对应的数
            //判断奇数偶数
            //偶数的话，就加上【0】
            //奇数的话就减去A中对应的数字
            for (int j=0;j<queries.length;j++){
                int a = A[queries[j][1]];
                int temp = a + queries[j][0];
                if ((a%2!=0)&&(temp%2)==0){
                    s+=temp;
                }else if((a%2==0)&&(temp%2)==0){
                    s+=queries[j][0];
                }else if((a%2==0)&&(temp%2)!=0) {
                    s-=a;
                }else {
                }
                A[queries[j][1]]=temp;
                //将s加入数组
                res[j] = s;
            }
            //返回
            return res;
        }
    }
}
