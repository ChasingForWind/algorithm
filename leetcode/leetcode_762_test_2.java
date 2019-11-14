package leetcode;

public class leetcode_762_test_2 {
    public static void main(String[] args) {
        countPrimeSetBits(244,269);
    }
    public static int countPrimeSetBits(int L, int R) {
        int sum = 0;
        for(int i = L;i <=R ; i++){
            if(isZS(Integer.bitCount(i))){
                sum++;
            }
        }
        return sum;
    }

    //d 的最大长度为20 因为10^6的二进制不大于20位
    public static boolean isZS(int d){
        if(d == 1 || d == 0) return false;
        for(int i = 2;i <= Math.sqrt(d);i++){
            if(d % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumZW(int d){
        int sum = 0;
        while(d != 0){
            if((sum & 1) == 1){
                sum++;
            }
            sum = sum >> 1;
        }
        return sum;
    }
}
