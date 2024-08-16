package com.jtc.Array;

import java.util.*;

public class RemovingDuplicats1stApproch {
  public static void main(String[] args) {
	int[] arr= {1,1,1,2,2,2,3,3,3,4,4};
	int[] i=Duplicats(arr);
	System.out.println("Total No. of Duplicats:-"+Arrays.toString(i));
	//Array print
//	for(int j=0;j<i;j++) {
//		System.out.println(arr[j]);
	//}
}
  static int[] Duplicats(int[] arr) {
	  Set<Integer> set=new HashSet<>();
	  for(int i=0;i<arr.length;i++) {
		  set.add(arr[i]);
	  }
	  int k=set.size();
	  int j=0;
	  int[] arr1=new int[k];
	  for(int num:set) {
		  arr1[j]=num;
		  j++;
	  }
	  return arr1;
  }
}
