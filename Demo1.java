public class Demo1 {
    public static void main(String[] args) {
        int left = 0;
        int right = 12;
        int mid = (int)(left+right)/2;//二分中值
        int mid2 = left + (right-left)>>1;
        System.out.println(mid);
        System.out.println(mid2);
    }
}
