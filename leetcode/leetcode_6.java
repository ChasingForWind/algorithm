package leetcode;

public class leetcode_6 {
    class Solution {
        public String convert(String s, int numRows) {
            StringBuilder[] sb = new StringBuilder[numRows];
            for (int k=0;k<numRows;k++){
                sb[k] = new StringBuilder("");
            }
            int flag = 1;
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (flag==1) {
                    sb[index].append(s.charAt(i));
                    index++;
                    if (index==4){
                        flag=0;
                        index=2;
                    }
                }
                if (flag==0){
                    sb[index].append(s.charAt(i));
                    index--;
                    if (index==-1){
                        flag=1;
                        index=1;
                    }
                }
            }
            StringBuilder res = new StringBuilder();
            for (int j=0;j<numRows;j++){
                res = res.append(sb[j]);
            }
            return res.toString();
        }
    }
}
