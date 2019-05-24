package helloWorld;

import java.util.Arrays;

public class GetMax {
	public static int getMax(int[] arr) {
		return process(arr,0,arr.length-1);
	}
	
	public static int process(int[] arr,int L, int R) {
		if(R==L) {
			return arr[R];
		}
		int mid = L + ((R-L)>>1);
		int leftMax = process(arr,L,mid);
		int rightMax = process(arr,mid+1,R);
		return Math.max(leftMax, rightMax);
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
  		int arr[] = geneteSortArray(10,10);
  		printArray(arr);
  		int num = getMax(arr);
  		System.out.println("the number is "+ num);
  	}
	

}
