package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            //建立两个arraylist
            ArrayList<Integer> pre = new ArrayList<>();
            ArrayList<Integer> cur = new ArrayList<>();
            //一个for循环
            for (int i=0;i<rowIndex;i++){
                cur = new ArrayList<>();
                for (int j=0;j<=i;j++){
                    if (j==0||j==i){
                        cur.add(1);
                    }else {
                        cur.add(pre.get(j-1)+pre.get(j));
                    }
                }

            }
            return cur;
        }
    }
}
