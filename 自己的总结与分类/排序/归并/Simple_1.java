package 自己的总结与分类.排序.归并;

import java.util.Arrays;

public class Simple_1 {
    public static void MergeSort(int[] array) {
        if (array == null || array.length < 2) return;
        MergeSort(0, array.length - 1, array);
    }

    public static void MergeSort(int left, int right, int[] array) {
        if (left == right) return;

        int mid = left + ((right - left) >> 1);

        MergeSort(left, mid, array);
        MergeSort(mid + 1, right, array);
        Merge(left, mid, right, array);
    }

    public static void Merge(int left, int mid, int right, int[] array) {
        //创建辅助数轴help
        int[] help = new int[right - left + 1];

        //创建三个指针，一个指向左边的数组，一个指向右边的数组，一个指向辅助数组
        int p = 0;
        int L = left;
        int R = mid + 1;
        //while 循环直到一个指针指到最右边跳出循环
        while (L <= mid && R <= right ) {
            help[p++] = array[L] < array[R] ? array[L++] : array[R++];
        }
        //将剩下的数字放到正确的位置
        while (L<=mid){
            help[p++] = array[L++];
        }
        while (R<=right){
            help[p++] = array[R++];
        }

        //将辅助数组里的数字写回
        for (int i = 0 ;i<help.length;i++){
            array[left+i] = help[i];
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
//            System.out.println("original array:");
//            printArray(arr1);
            int[] arr2 = copyArray(arr1);
            MergeSort(arr1);
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
