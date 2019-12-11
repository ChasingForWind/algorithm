package leetcode;

import java.util.HashMap;

public class leetcode_36 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashMap<Integer,Integer>[] row = new HashMap[9];
            HashMap<Integer,Integer>[] col = new HashMap[9];
            HashMap<Integer,Integer>[] box = new HashMap[9];
            for (int i = 0; i < 9; i++) {
                row[i] = new HashMap<Integer, Integer>();
                col[i] = new HashMap<Integer, Integer>();
                box[i] = new HashMap<Integer, Integer>();
            }
            for (int i=0;i<board.length;i++){
                for (int j=0;j<board[0].length;j++){
                    if (board[i][j]!='.'){
                        int num = (int)board[i][j];
                        row[i].put(num,row[i].getOrDefault(num,0)+1);
                        col[j].put(num,col[j].getOrDefault(num,0)+1);
                        int temp = j/3;
                        int temp2= i/3+temp*3;
                        box[temp2].put(num,box[temp2].getOrDefault(num,0)+1);
                        if (row[i].get(num)>1||col[j].get(num)>1||box[temp2].get(num)>1){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
