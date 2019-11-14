package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class leetcode_868 {
    class Solution {
        public int binaryGap(int N) {
            ArrayList<Integer> array = new ArrayList<>();
            int i=0;
            while (N!=0){
                if ((N&1)!=0){
                    array.add(i);
                }
                N=N>>1;
                i++;
            }
            Collections.sort(array);
            int max=0;
            for (int j=0;j<array.size()-1;j++){
                int temp = array.get(j+1)-array.get(j);
                if (temp>max){
                    max = temp;
                }
            }
            return max;
        }
    }
}
