package leetcode;

import java.util.HashSet;

public class leetcode_929_test {
    public static void main(String[] args) {
        String[] strings = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        numUniqueEmails(strings);
    }
    public static int numUniqueEmails(String[] emails) {
        //建立hashset
        HashSet<String> strings = new HashSet<>();
        //进行强for循环
        for (String email:emails){
            //根据@进行split
            String[] split = email.split("@");
            //按照规则处理前面的字符串
            StringBuilder stringBuilder = new StringBuilder();
            //1.+忽略后面的内容
            //.会被忽略
            for (int i=0;i<split[0].length();i++){
                if (split[0].charAt(i)=='.') continue;
                if (split[0].charAt(i)=='+') break;
                stringBuilder.append(split[0].charAt(i));
            }
            stringBuilder.append(split[1]);
            String s = stringBuilder.toString();
            //和后面的字符串进行拼接后存入hashset
            strings.add(s);
        }
        //结束循环返回hashset长度
        return strings.size();
    }
}
