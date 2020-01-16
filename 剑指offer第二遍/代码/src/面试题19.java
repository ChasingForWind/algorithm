public class 面试题19 {
    public class Solution {
        public boolean match(char[] str, char[] pattern)
        {
            if (str==null||pattern==null) return false;
            return matchCore(str,pattern,0,0);
        }
        public boolean matchCore(char[] str,char[] pattern,int index1,int index2){
            //两者都到极限，返回true
            if ((index1==str.length)&&(index2==pattern.length)) return true;
            //如果str没到极限，patte到了，返回false
            if((index1!=str.length)&&(index2==pattern.length)) return false;
            //如果遇到“.”则两者都向前走一步
            //if (pattern[index2]=='.') return matchCore(str,pattern,index1+1,index2+1);
            //如果遇到index2的下一个是“*”，则要么"*"前面的字符与当前相匹配，要么不匹配
            if (index2 + 1 < pattern.length && pattern[index2 + 1] == '*'){
                //相互匹配
                if ((index1 != str.length && pattern[index2] == str[index1]) || (pattern[index2] == '.' && index1 != str.length)){
                    return matchCore(str, pattern, index1+1, index2)||matchCore(str, pattern, index1+1, index2+2)||matchCore(str, pattern, index1, index2+2);
                }else {//如果不相匹配
                    return matchCore(str, pattern, index1, index2+2);
                }
            }

            //最后是两个指向的字符相匹配
            if ((index1 != str.length && pattern[index2] == str[index1]) || (pattern[index2] == '.' && index1 != str.length))
                return matchCore(str, pattern, index1+1, index2+1);
            return false;
        }
    }
}
