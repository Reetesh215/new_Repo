package com.jtc.Array;

public class MissingElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,7};
	int ans=missingElement(arr);
	System.out.println(ans);
}
static int missingElement(int[] arr) {
	for(int i=1;i<=arr.length+1;i++) {
		int flag=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==i) {
				flag=1;
				break;
			}
		}
		if(flag==0)
		return i;
	}
	return -1;
}
  
}
