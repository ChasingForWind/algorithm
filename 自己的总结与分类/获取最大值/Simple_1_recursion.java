package 获取最大值;

public class Simple_1_recursion {
    public static int get_max(int[] array){
        return process(array,0,array.length-1);
    }

    public static int process(int[] array,int left, int right){
        if (left==right) return array[left];
        int mid = left + ((right-left)>>1);
        int leftMax = process(array,left,mid);
        int rightMax = process(array,mid+1,right);
        return Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,3,9};
        System.out.println(get_max(array));
    }
}
