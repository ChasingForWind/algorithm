package leetcode;

public class leetcode_1189 {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] m = new int[26];
            for (int i=0;i<text.length();i++){
                m[text.charAt(i)-97]++;
            }
            m['l'-97] = m['l'-97]/2;
            m['o'-97] = m['o'-97]/2;
            String str = "balon";
            int min = Integer.MAX_VALUE;
            for (char c : str.toCharArray()){
                if(min>m[c-97]){
                    min = m[c-97];
                }
            }
            return min;
        }
    }
}
