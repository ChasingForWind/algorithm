package leetcode;

public class leetcode_557_test {
    static  StringBuilder result = new StringBuilder();
    static StringBuilder temp = new StringBuilder();
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }

    public static String reverseWords(String s) {
       // int flag = 0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)==' '){
                reverse(temp);
                result.append(' ');
               // flag = 1;
                continue;
            }
            //if (s.charAt(i)==' ') reverse(temp);
            temp = temp.append(s.charAt(i));
        }
        reverse(temp);
        return result.toString();
    }
    public static void reverse(StringBuilder temp){
        StringBuilder reverse = temp.reverse();
        result.append(reverse);
        temp.setLength(0);
    }
}

