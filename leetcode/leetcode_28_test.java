package leetcode;

public class leetcode_28_test {
    public static void main(String[] args) {
        strStr("hello","ll");
    }
    public static int strStr(String haystack, String needle) {
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();
        int index1 = 0;
        int index2 = 0;
        while (index1<char1.length){
            if (char1[index1]==char2[index2]){
                int result = index1;
                while (index2<char2.length){
                    if (char1[index1]!=char2[index2]){
                        return -1;
                    }
                    index1++;
                    index2++;
                }
                return result;
            }
            index1++;
        }
        return -1;
    }
}
