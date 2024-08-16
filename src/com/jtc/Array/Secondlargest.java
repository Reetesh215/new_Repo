package com.jtc.Array;

public class Secondlargest {
	static int secondlarge(int[] arr) {
		int large=arr[0];
		int slarge=-1;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>large) {
				slarge=large;
				large=arr[i];
			}else if(arr[i]<large && arr[i]>slarge){
				slarge=arr[i];
			}
		}
		return slarge;
	}
public static void main(String[] args) {
	int[] arr= {1,3,7,9,6};
	System.out.println(secondlarge(arr));
}
}
