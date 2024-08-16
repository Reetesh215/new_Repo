package com.jtc.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class movingAllZeroatEnd {
  public static void main(String[] args) {
	int[] arr= {1,0,2,3,2,0,0,4,5,1};
	ZerosAtEnd(arr);
	System.out.println(Arrays.toString(arr));
}
  static void ZerosAtEnd(int[] arr) {
	  ArrayList<Integer> temp=new ArrayList<Integer>();
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]!=0) {
			  temp.add(arr[i]);
		  }
		  
	  }
	  int nz=temp.size();
	  for(int i=0;i<nz;i++) {
		  arr[i]=temp.get(i);
	  }
	  for(int i=nz;i<arr.length;i++) {
		  arr[i]=0;
	  }
  }
}
