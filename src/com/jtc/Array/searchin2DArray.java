package com.jtc.Array;
public class searchin2DArray {
public static void main(String[] args) {
	int[][] arr= {
			{23,4,1},
			{18,12,3,9},
			{78,99,34,56},
			{18,12}
	};
//	int target=56;
//	int[] ans=search(arr,target);
//	System.out.println(Arrays.toString(ans));
	System.out.println(max(arr));
}
  static int[] search(int[][] arr,int target) {
	  for(int row=0;row<arr.length;row++) {
		  for(int column=0;column<arr[row].length;column++) {
			  if(arr[row][column]==target) {
				  return new int[] {row,column};
			  }
		  }
	  }
	  return new int[] {-1,-1} ;
  }
  //Find max value in 2D array
  static int max(int[][] arr) {
	  int maxValue=Integer.MIN_VALUE;
	  for(int row=0;row<arr.length;row++) {
		  for(int column=0;column<arr[row].length;column++) {
			  if(arr[row][column] >maxValue) {
				  maxValue=arr[row][column];
			  }
		  }
	  }
	  return maxValue;
  }
}
