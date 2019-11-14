package leetcode;

public class leetcode_762 {
    class Solution {
        public int countPrimeSetBits(int L, int R) {
            int count = 0;
            for (int i=L;i<=R;i++){
                int number = helpNumber(i);

                if (check(number)) count++;
            }
            return count;
        }

        public int helpNumber(int i){
            int size =0;
            while (i!=0){
                if ((i&1)==1){
                    size++;
                }
                i=i>>1;
            }
            return size;
        }

        public boolean check(int number){
            if (number==1) return false;
            for (int i=2;i<number;i++){
                if (number%i==0) return false;
            }
            return true;
        }
    }
}
