import java.util.ArrayList;
import java.util.Collections;

public class 面试题38 {
    public class Solution {
        ArrayList<String> list =new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        public ArrayList<String> Permutation(String str) {
            if (str==null||str.length()==0) return list;
            char[] chars = str.toCharArray();
            int[] book = new int[str.length()];
            //标记
            for (int i = 0; i < str.length(); i++) {
                book[i] = 0;
            }
            PermutationCore(chars,book,0);
            Collections.sort(list);
            return list;
        }
        public void PermutationCore(char[] chars,int[] book,int step){
            //如果走到头
            if (sb.length()==chars.length){
                //去重
                if (!list.contains(sb.toString())){
                    String s = sb.toString();
                    list.add(s);
                    return;
                }
            }
            //遍历
            for (int i=0;i<chars.length;i++){

                if (book[i]!=1){
                    //添加
                    sb.append(chars[i]);
                    book[i] = 1;

                    PermutationCore(chars,book,step+1);

                    //还原
                    sb.deleteCharAt(sb.length()-1);
                    book[i]=0;
                }
            }
        }
    }
}
