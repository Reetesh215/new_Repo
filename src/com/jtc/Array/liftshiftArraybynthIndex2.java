package com.jtc.Array;

import java.util.Arrays;

public class liftshiftArraybynthIndex2 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	shift(arr,3);
	System.out.println(Arrays.toString(arr));
}
static void liftShift(int[] arr) {
	int temp=arr[0];
	for(int i=1;i<arr.length;i++) {
		arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
}
static void shift(int[] arr,int d) {
	d=d%arr.length;//if d id < arr.length then d will be that
	//number itself but if it is grater then arr.length then d will be reminder
	for(int i=0;i<d;i++) {
		liftShift(arr);
	}
}
}
