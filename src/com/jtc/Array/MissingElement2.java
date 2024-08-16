package com.jtc.Array;

public class MissingElement2 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,7};
	int ans=missingNo(arr);
	System.out.println(ans);
}
static int missingNo(int[] arr) {
	int sum=(arr.length+1)*((arr.length+1)+1)/2;
	int sum2=0;
	for(int i=0;i<arr.length;i++) {
		sum2=sum2+arr[i];
	}
	int missingNO=sum-sum2;
	return missingNO;
}
}
