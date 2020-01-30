public class 面试题61 {
    public class Solution {
        public String LeftRotateString(String str,int n) {
            //做三次旋转
            if (str==null||str.length()==0) return "";
            char[] chars = str.toCharArray();
            reverse(chars,0,n-1);
            reverse(chars,n,str.length()-1);
            reverse(chars,0,chars.length-1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i]);
            }
            String s = sb.toString();
            return s;
        }
        public void reverse(char[] chars,int start,int end){
            while (start<end){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
    }
}
