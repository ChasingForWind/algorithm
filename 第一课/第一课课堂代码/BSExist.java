package helloWorld;

import java.util.Arrays;

public class BSExist {
	
	public static boolean BSExit(int[] sortedArr,int num) {
		if(sortedArr==null ||sortedArr.length==0) {
			return false;
		}
		else {
			int L = 0;
			int R = sortedArr.length-1;
			int mid = 0;
			while(L<R) {
				mid = L + ((R-L)>>1);
				if(sortedArr[mid] == num) {
					return true;
				}else if(sortedArr[mid]>num) {
					R = mid -1;
				}else {
					L = mid + 1;
				}
			}
			return sortedArr[L] == num;
		}
	}
	//打印数轴
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	//产生从小到大的随机数
	public static int[] geneteSortArray (int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		Arrays.sort(arr);
		return arr;	
	}
	public static void main(String[] args) {
		int maxSize = 10;
		int maxValue = 10;
		int num = 5;
		int[] arr = geneteSortArray(maxSize,maxValue);
		printArray(arr);
		System.out.println("num is "+num);
		boolean result=BSExit(arr,num);
		System.out.println(result?"in !":"not in!");
	}

}
