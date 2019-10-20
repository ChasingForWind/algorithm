package leetcode;

public class leetcode_977 {
    class Solution {
        public int[] sortedSquares(int[] A) {
            //找到n p指针的坐标
            int p = -1;
            int n = -1;
            for (int i = 0; i < A.length; i++) {
                if (A[i] < 0) n++;
            }
            p = n + 1;
            //新建一个数组
            int arr[] = new int[A.length];
            int index = 0;
            while(n>=0&&p<=(A.length-1)){
                if (A[n]*A[n]<A[p]*A[p]){
                    arr[index] = A[n]*A[n];
                    index++;
                    n--;
                }else{
                    arr[index] = A[p]*A[p];
                    index++;
                    p++;
                }
            }
            while(n>=0){
                arr[index]=A[n]*A[n];
                index++;
                n--;
            }
            while (p<=A.length-1){
                arr[index]=A[p]*A[p];
                index++;
                p++;
            }
            return arr;
        }
    }
}
