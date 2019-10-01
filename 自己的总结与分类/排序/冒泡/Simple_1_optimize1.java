package 自己的总结与分类.排序.冒泡;


//鸡尾酒算法

import java.util.Arrays;

public class Simple_1_optimize1 {
    //主代码
    public static void bubble(int[] array) {
        if (array==null||array.length<2){
            return;
        }
        int left = 0;
        int right = array.length-1;

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = left; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }


            right = i-1;
            if (right==left) break;

            for (int k = right;k>left;k--){
                if (array[k]<array[k-1]){
                    swap(array,k,k-1);
                }
            }

            left = left+1;

        }
    }

    //交换
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
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
//            System.out.println("original array:");
//            printArray(arr1);
            int[] arr2 = copyArray(arr1);
            bubble(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        //int[] arr = generateRandomArray(maxSize, maxValue);
        //printArray(arr);
        //selectionSort(arr);
        //printArray(arr);
    }
}
