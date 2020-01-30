public class 面试题62 {
    public class Solution {
        public String ReverseSentence(String str) {
            if (str.length()==0||str==null) return "";
            if (str.equals(" ")) return " ";
            String regex = " ";
            String[] split = str.split(regex);
            for (int j = 0; j < split.length; j++) {
                String reverse = reverse(split[j]);
                split[j] = reverse;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                if (i==split.length-1){
                    sb.append(split[i]);
                }else {
                    sb.append(split[i]).append(" ");
                }
            }
            return reverse(sb.toString());
        }
        public String reverse(String str){
            char[] chars = str.toCharArray();
            int start = 0;
            int end = chars.length-1;
            while (start<end){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i]);
            }
            return sb.toString();
        }
    }
}
