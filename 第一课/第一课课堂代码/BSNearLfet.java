package helloWorld;

import java.util.Arrays;

public class BSNearLfet {
    public static int bsNearLeft(int[] arr, int value) {
    	int L = 0;
    	int R = arr.length-1;
    	int index = -1;
    	int mid = 0;
    	while(L<R) {
    		mid = L+((R-L)>>1);
    		if(arr[mid]>=value) {
    			index = mid;
    			R = mid-1;
    		}else {
    			L = mid + 1;
    		}
    	}
    	return index;
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
  		int[] arr = geneteSortArray(maxSize,maxValue);
  		printArray(arr);
  		int value = 5;
  		int index = bsNearLeft(arr,value);
  		System.out.println("answer is "+index);
  	}
}
