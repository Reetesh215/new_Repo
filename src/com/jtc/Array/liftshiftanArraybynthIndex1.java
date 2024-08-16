package com.jtc.Array;

import java.util.Arrays;

public class liftshiftanArraybynthIndex1 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	leftRotatebyD(arr, 8, arr.length);
	System.out.println(Arrays.toString(arr));
}
static void leftRotatebyD(int[] arr,int d,int n) {
	d=d%n;
	int[] temp=new int[d];
	for(int i=0;i<d;i++) {
		temp[i]=arr[i];
	}
	for(int i=d;i<arr.length;i++) {
		arr[i-d]=arr[i];
	}
	for(int i=n-d;i<arr.length;i++) {
		arr[i]=temp[i-(n-d)];
	}
}
}
