/*
归并操作(merge)，也叫归并算法，指的是将两个顺序序列合并成一个顺序序列的方法。
如　设有数列{6，202，100，301，38，8，1}
初始状态：6,202,100,301,38,8,1
第一次归并后：{6,202},{100,301},{8,38},{1}，比较次数：3；
第二次归并后：{6,100,202,301}，{1,8,38}，比较次数：4；
第三次归并后：{1,6,8,38,100,202,301},比较次数：4；
总的比较次数为：3+4+4=11；
逆序数为14；
*/


import java.util.Arrays;

public class Code01_MergeSort {

    public static void mergeSort(int[] arr) {
        if(arr.length<2||arr==null){
            return;
        }

        mergeSort(arr,0,arr.length-1);

    }


        public static void mergeSort(int[] arr, int L, int R) {
            if (R==L){
                return;
            }

            int mid = L+((R-L)>>2);
            mergeSort(arr,L,mid);
            mergeSort(arr,mid+1,R);
            merge(arr,L,mid,R);

    }

    public static void merge(int[] arr, int L, int mid, int R) {
            int[] help = new int[R-L+1];
            int p1 = L;
            int p2 = mid+1;
            int i = 0;
            while(p1<=mid&&p2<=R){
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
    }

    // for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
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
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            mergeSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        mergeSort(arr);
        printArray(arr);

    }

}