package com.jtc.Array;

public class smallest {
	static int small(int[] arr) {
		int smallest=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
	}
public static void main(String[] args) {
	int [] arr= {1,3,-1,5,9,-2};
	System.out.println(small(arr));
}
}
