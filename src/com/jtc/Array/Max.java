package com.jtc.Array;

public class Max {
	static int max(int[] arr) {
		int maxVal=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(maxVal<arr[i]) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
public static void main(String[] args) {
	int[] arr= {1,3,15,9,24};
	System.out.println(max(arr));
}
}
