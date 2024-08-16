package com.jtc.Array;

public class MaxRang {
	static int max(int[] arr,int index1,int index2) {
		int maxVal=arr[index1];
		for(int i=index1;i<=index2;i++) {
			if(maxVal<arr[i]) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
public static void main(String[] args) {
	int[] arr= {1,3,12,9,24};
	
	System.out.println(max(arr,1,4));
}
}
