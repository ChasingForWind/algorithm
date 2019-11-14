package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class leetcode_349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int i :nums1){
                set1.add(i);
            }
            for (int j:nums2){
                set2.add(j);
            }
            ArrayList<Integer> result = new ArrayList<>();
            if (set1.size()<=set2.size()){
                for (int i :set1){
                    for (int j:set2){
                        if (i==j){
                            result.add(i);
                        }
                    }
                }
            }else{
                for (int i :set2){
                    for (int j:set1){
                        if (i==j){
                            result.add(i);
                        }
                    }
                }
            }
            int size = result.size();
            int[] arr = new int[size];
            for (int i=0;i<size;i++){
                arr[i] = result.get(i);
            }
            return arr;
        }
    }
}
