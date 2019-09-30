import java.util.ArrayList;

public class Demo11 {
    public static void main(String[] args) {
        int[] array = {4,5,1,2,3};
        minNumberInRotateArray(array);
    }

    public static int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length-1;
        while (low<high){
            int mid = low+(high-low)/2;
            if(array[mid]>array[high]){
                low = mid+1;
            }else if(array[mid]==array[high]){
                high--;
            }else{
                high=mid;
            }
        }
        return array[low];
    }

}
