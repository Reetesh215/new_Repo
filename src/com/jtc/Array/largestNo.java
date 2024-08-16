package com.jtc.Array;


public class largestNo {
	static int large(int[] arr) {
		int largestVal=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>largestVal) {
				largestVal=arr[i];
			}
		}
		return largestVal;
	}
public static void main(String[] args) {
	int[] arr= {1,3,12,9,24};
	System.out.println(large(arr));
}
}
