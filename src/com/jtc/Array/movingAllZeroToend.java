package com.jtc.Array;

import java.util.Arrays;

public class movingAllZeroToend {
public static void main(String[] args) {
	int[] arr= {1,0,2,3,2,0,0,4,5,1};
	movingZerotoEnd(arr);
	System.out.println(Arrays.toString(arr));
}
static void movingZerotoEnd(int[] arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[count]=arr[i];
			count++;
		}
	}
	for(int i=count;i<arr.length;i++) {
		arr[i]=0;
	}
}
}
