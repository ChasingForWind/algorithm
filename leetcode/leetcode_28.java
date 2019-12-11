package leetcode;

public class leetcode_28 {
    /*暴力法*/
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.isEmpty()&&needle.isEmpty()) return 0;
            if (haystack.isEmpty()&&!needle.isEmpty()) return -1;
            if (!haystack.isEmpty()&&needle.isEmpty()) return 0;
            char[] char1 = haystack.toCharArray();
            char[] char2 = needle.toCharArray();
            if(char1.length<char2.length) return -1;
            int index1 = 0;
            int index2 = 0;
            while (index1<char1.length){
                if (char1[index1]==char2[index2]){
                    int result = index1;
                    boolean flag = true;
                    int index1_temp = index1;
                    int index2_temp = index2;
                    while (index2_temp<char2.length){
                        if (index1_temp>=char1.length||char1[index1_temp]!=char2[index2_temp]){
                            flag=false;
                            break;
                        }
                        index1_temp++;
                        index2_temp++;
                    }
                    if (flag==true){
                        return result;
                    }
                }
                index1++;
            }
            return -1;
        }
    }
}
