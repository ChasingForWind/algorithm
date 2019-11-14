package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_1030 {
    class Solution {
        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            //创建hashmap,值为Integer，键为int[]集合
            HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    int l = Math.abs(r - r0) + Math.abs(c - c0);
                    if (map.containsKey(l)) {
                        ArrayList<int[]> lv = map.get(l);
                        lv.add(new int[]{r, c});
                    } else {
                        ArrayList<int[]> lv = new ArrayList<>();
                        lv.add(new int[]{r, c});
                        map.put(l, lv);
                    }
                }
            }
            int key = 0;
            ArrayList<int[]> arrayList = new ArrayList<>();
            while (map.containsKey(key)) {
                arrayList.addAll(map.get(key));
                key++;
            }
            int[][] result1 = new int[R * C][2];
            for (int i = 0; i < arrayList.size(); i++) {
                result1[i][0] = arrayList.get(i)[0];
                result1[i][1] = arrayList.get(i)[1];
            }
            return result1;
        }
    }
}
