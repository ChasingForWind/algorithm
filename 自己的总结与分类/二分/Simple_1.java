package 自己的总结与分类.二分;


/*简单二分的基本思路*/

public class Simple_1 {
    public static boolean BSExit(int[] array ,int num){
        if (array==null||array.length<=0) return false;

        int left = 0;
        int right = array.length-1;
        int mid = 0;

        while (left<right){
            mid = left + (right-left)>>1;
            if (array[mid]==num) return true;
            else if (array[mid]<num) left = mid + 1;
            else right = mid - 1;
        }
        return array[left]==num ? true:false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int num = 3;
        boolean b = BSExit(array, num);
        System.out.println(b);
    }
}
