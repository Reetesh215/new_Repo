package com.jtc.Array;

import java.util.Arrays;

public class liftshiftArraybynthIndex3 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	shiftLift(arr, 3);
	System.out.println(Arrays.toString(arr));
}
static void shiftLift(int[] arr,int d) {
	d=d%arr.length;
	reverse(arr, 0, d-1);
	reverse(arr, d, arr.length-1);
	reverse(arr, 0, arr.length-1);
}
static void reverse(int[] arr,int start,int end) {
		while(start<end) { 
		 int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
}
