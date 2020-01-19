import java.util.ArrayList;
import java.util.Collections;

public class 面试题38_字符排列解法 {
    public class Solution {
        ArrayList<String> res = new ArrayList<String>();
        public ArrayList<String> Permutation(String str) {
            if(str==null||str.length()==0) return res;
            char[] chars = str.toCharArray();
            PermutationCore(0,chars);
            Collections.sort(res);
            return res;
        }
        public void PermutationCore(int index,char[] ch){
            if (index==ch.length-1){
                String s = String.valueOf(ch);
                if (!res.contains(s)){
                    res.add(s);
                    return;
                }
            }

            for (int i=index;i<ch.length;i++){
                swap(ch,index,i);
                PermutationCore(index+1,ch);
                swap(ch,i,index);
            }
        }
        public void swap(char[] ch,int i,int j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }
}
