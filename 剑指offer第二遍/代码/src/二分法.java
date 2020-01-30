public class 二分法 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int k = 6;
        int out = GetIndex(array, k);
        System.out.println(out);
    }
    public static int GetIndex(int[] array,int k){
        if (array==null||array.length==0) return 0;
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while (left<right){
            mid = left+(right-left)/2;
            if (array[mid]<k){
                left = mid+1;
            }else if (array[mid]>k){
                right = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
