public class 面试题20 {
    public class Solution {
        public boolean isNumeric(char[] str) {
            //整数部分
            int index = 0;
            for (int i = 0; i < str.length; i++) {
                if (i==0&&(str[i]==43||str[i]==45)) continue;
                //开始判断小数
                if (str[i]=='.') return smallCheck(i,str);
                //开始判断指数数
                if (str[i]=='e'||str[i]=='E') return powCheck(i,str);

                if(checkNormal(i, str)) return false;

            }
            return true;

        }
        //整数部分
        public boolean checkNormal(int i ,char[] str){
            return str[i] < 48 || str[i] > 57;
        }
        //小数部分
        public boolean smallCheck(int i,char[] str){
            for (int j = i+1; j <str.length ; j++) {
                if (str[j]=='e'||str[j]=='E') return powCheck(j,str);
                if (checkNormal(j, str)) return false;

            }
            return true;
        }
        //指数部分
        public boolean powCheck(int i ,char[] str){
            if (i==str.length-1) return false;
            for (int j = i+1; j <str.length ; j++) {
                if (j==i+1&&(str[j]==43||str[j]==45)) continue;
                if (checkNormal(j, str)) return false;
            }
            return true;
        }
    }


}
