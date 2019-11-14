package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class leetcode_1170_test {
    public static void main(String[] args) {
        String[] queries = {"bbb","cc"};

        String[] words = {"a","aa","aaa","aaaa"};
        int[] res = numSmallerByFrequency(queries, words);
    }
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        ArrayList<Integer> fword = new ArrayList<>();
        for (int i=0;i<words.length;i++){
            fword.add(f(words[i]));
        }
        Collections.sort(fword);
        int[] res = new int[queries.length];
        for (int j=0;j<queries.length;j++){
            int temp = f(queries[j]);
            int count=0;
            for (int k=0;k<fword.size();k++){
                // if (temp<fword.get(0)) break;

                if (temp>=fword.get(k)){
                    count++;
                    //res[j] = fword.size()-count;
                    continue;
                }

                res[j] = fword.size()-count;
                count=0;
                break;
            }
        }
        return res;
    }
    public static int f(String s){
        char min = s.charAt(0);
        int count=0;
        for (int n=0;n<s.length();n++){
            if (s.charAt(n)<min){
                count=0;
                min = s.charAt(n);
            }
            if (s.charAt(n)==min){
                count++;
            }
        }
        return count;
    }
}
