package leetcode;

public class leetcode_1122 {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            //建立一个1001的数组
            int[] m = new int[1001];
            //建立一个排序好的数组作为返回结果
            int[] result = new int[arr1.length];
            //遍历arr1 入桶记录个数
            for (int i = 0; i < arr1.length; i++) {
                m[arr1[i]]++;
            }
            //遍历arr2 出桶在result上排序
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                while (m[arr2[j]] != 0) {
                    result[count] = arr2[j];
                    count++;
                    m[arr2[j]]--;
                }
            }
            //再次遍历m数组，返回排好序的数字
            for (int k=0;k<m.length;k++){
                while(m[k]!=0){
                    result[count] =k;
                    count++;
                    m[k]--;
                }
            }
            //返回结果
            return result;
        }
    }
}
