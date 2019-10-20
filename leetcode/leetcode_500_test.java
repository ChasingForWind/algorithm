package leetcode;

import java.util.ArrayList;

public class leetcode_500_test {
    static String s1 = "qwertyuiop";
    static String s2 = "asdfghjkl";
    static String s3 = "zxcvbnm";
    public static void main(String[] args) {
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words = findWords(strings);
        System.out.println(words);
    }


    public static String[] findWords(String[] words) {
        ArrayList<String> strings = new ArrayList<>();
        for (String word : words) {
            if (jugle(word.toLowerCase())) {
                strings.add(word);
            }
        }
        String[] A = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            A[i] = strings.get(i);
        }
        return A;
    }
    public static boolean jugle(String word){
        int flag0 = classfy(word.charAt(0));
        for (int i =1;i<word.length();i++){
            int flag1 = classfy(word.charAt(i));
            if (flag0!=flag1) return false;
        }
        return true;
    }
    public static int classfy(char ch){

        if (s1.indexOf(ch+"")!=-1) return 1;
        if (s2.indexOf(ch+"")!=-1) return 2;
        if (s3.indexOf(ch+"")!=-1) return 3;
        return 0;
    }
}
