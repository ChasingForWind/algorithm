package leetcode;

public class leetcode_9_test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int remain = x;
        int rev=0;
        int pop=0;
        while (x!=0){
            pop = x%10;
            x=x/10;
            if (rev>Integer.MAX_VALUE/10||rev==Integer.MAX_VALUE/10&&pop>7) return false;
            rev = rev*10+pop;
        }
        return rev==remain?true:false;
    }
}
