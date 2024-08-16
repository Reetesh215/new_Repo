package com.jtc.Array;

public class secondSmallestVal {
	static int ssmallest(int[] arr) {
		int smallest=arr[0];
		int ssmallest=Integer.MAX_VALUE;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<smallest) {
				ssmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]>smallest && arr[i]<ssmallest) {
				ssmallest=arr[i];
			}
		}
		return ssmallest;
	}
public static void main(String[] args) {
	int [] arr= {-2,-1,1,3,12,1,9,18};
	System.out.println(ssmallest(arr));
}
}
