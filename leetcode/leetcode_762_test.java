package leetcode;

public class leetcode_762_test {
    public static void main(String[] args) {
        int i = countPrimeSetBits(244, 269);

    }
    public static int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i=L;i<=R;i++){
            int number = helpNumber(i);
            if (check(number)) count++;
        }
        return count;
    }

    public static int helpNumber(int i){
        int size =0;
        //System.out.println(i);
        while (i!=0){
            if ((i&1)==1){
                size++;
            }
            i=i>>1;
        }
        return size;
    }

    public static boolean check(int number){
        for (int i=2;i<number;i++){
            if (number%i==0) return false;
        }
        return true;
    }
}
