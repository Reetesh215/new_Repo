package com.jtc.Array;

public class consusitiveOnes {
public static void main(String[] args) {
	int[] arr= {1,0,1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1};
	int ans=MaximumtimesOnes(arr);
	System.out.println(ans);
}
static int MaximumtimesOnes(int[] arr) {
	int max=0,count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
		}else 
			count=0;
		if(max>count)
			max=max;
		else
			max=count;
	}
	return max;
}
 }
