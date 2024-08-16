package com.jtc.Array;

import java.util.Arrays;

public class ReplaceAnarraysby1Place {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	replaceBy1(arr);
	System.out.println(Arrays.toString(arr));
}
static void replaceBy1(int[] arr) {
	int temp=arr[0];
    //int k=arr.length;
	for(int i=1;i<arr.length;i++) {
		 arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
}
}
