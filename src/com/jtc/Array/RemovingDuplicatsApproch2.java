package com.jtc.Array;

public class RemovingDuplicatsApproch2 {
public static void main(String[] args) {
	int[] arr= {1,1,1,2,2,2,3,3,3,4,4,4};
	int k=duplicate(arr);
	System.out.println("Total No. of Duplicates:- "+k);
	//for No of Duplicate
	for(int i=0;i<k;i++) {
		System.out.println(arr[i]);
	}
	
}
  static int duplicate(int[] arr) {
	  int i=0;
	
	  for(int j=0;j<arr.length;j++) {
		  if(arr[i]!=arr[j]) {
			  i++;
			 arr[i]=arr[j];
			  
			  
		  } 
	  }
	  return i+1;
  }
}
