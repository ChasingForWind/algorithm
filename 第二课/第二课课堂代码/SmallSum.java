/*小和问题 在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组 的小和。
求一个数组 的小和。 
例子:[1,3,4,2,5]
 1左边比1小的数，没有; 
 3左边比3小的数，1; 
 4左 边比4小的数，1、3; 
 2左边比2小的数，1; 
 5左边比5小的数，1、3、4、 2; 
 所以小和为1+1+3+1+1+3+4+2=16
*/

import java.util.Arrays;

public class SmallSum {

    public static int SmallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
        return 0;
    }
       return mergeSort(arr,0,arr.length-1);
    }


    public static int mergeSort(int[] arr, int L, int R) {
        if(R==L){
            return 0;
        }
        int mid = L+((R-L)>>1);
        return mergeSort(arr,0,mid)
                +mergeSort(arr,mid+1,R)+
                merge(arr,L,mid,R);

    }

    public static int merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R-L+1];
        int p1 = L;
        int p2 = mid+1;
        int i = 0;
        int res=0;
        while(p1<=mid&&p2<=R){
            res += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=mid){
            help[i++] = arr[p1++];
        }
        while(p2<=R){
            help[i++] = arr[p2++];
        }
        for(i=0;i<help.length;i++){
            arr[L+i] = help[i];
        }
        return res;
    }

    // for test
    public static int comparator(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                res += arr[j] < arr[i] ? arr[j] : 0;
            }
        }
        return res;
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {
        int maxSize = 5;
        int maxValue = 10;
        int[] arr1 = generateRandomArray(maxSize, maxValue);
        printArray(arr1);
        int a =comparator(arr1);
        System.out.println(a);

        int res = SmallSum(arr1);
        printArray(arr1);
        System.out.println(res);
    }

}