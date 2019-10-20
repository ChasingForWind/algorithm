package 自己的总结与分类.排序.堆;

import java.util.Arrays;

public class Simple_1 {

    public static void heapSort(int[] array) {
        if (array == null || array.length < 2)
        {
            return;
        }
        //先把数组变成堆
        for (int i = 0; i < array.length; i++) {
            heapInsert(array, i);
        }
        //每次利用堆结构的特性把最大的元素放到数轴末尾
        int size = array.length;
        swap(array, 0, --size);
        while (size > 0) {
            heapify(array, 0, size);
            swap(array, 0, --size);
        }
    }

    public static void heapInsert(int[] array, int index) {
        while (array[index] > array[(index - 1) / 2]) { //当子节点大于父节点
            //上移
            swap(array, index, (index - 1) / 2);
            //继续向上比较
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] array, int index, int size) {
        //获取右儿子
        int left = index * 2 + 1;
        while (left < size) {
            //判断出左右儿子中最大的一个
            //int largest = left + 1 < size && array[left] > array[left+1] ? left  :  left + 1;
            int largest = left + 1 < size && array[left + 1] > array[left] ? left + 1 : left;
            //左右儿子最大的一个与父节点比较
            largest = array[index] > array[largest] ? index : largest;
            if (largest == index) {
                break;
            }
            swap(array, largest, index);
            index = largest;
            left = index * 2 + 1;
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
            heapSort(arr1);
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
