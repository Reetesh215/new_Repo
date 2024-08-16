package com.jtc.Array;

public class LinearSearch {
public static void main(String[] args) {
	int[] nums= {1,5,10,-1,45,29};
	int target=19;
	int num=search(nums, target);
	System.out.println(num);
}
static int search(int [] arr,int target) {
	if(arr.length==0) {
		return -1;
	}
	for(int index=0;index<=arr.length-1;index++) {
		if(arr[index]==target) {
			return index;
		}
	}
	return 1;
}
   
}
