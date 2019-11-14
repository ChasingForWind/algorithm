package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_1200 {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> lists = new ArrayList<>();
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                array.add(arr[i]);
            }
            Collections.sort(array);
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < array.size()-1; j++) {
                int temp = array.get(j+1)-array.get(j);
                if (temp<min){
                    min = temp;
                }
            }

            for (int k=0;k<array.size();k++){
                ArrayList<Integer> list = new ArrayList<>();
                int temp2 = array.get(k+1)-array.get(k);
                if (temp2==min){
                    list.add(array.get(k));
                    list.add(array.get(k+1));
                    lists.add(list);
                }
            }
            return lists;
        }
    }
}
