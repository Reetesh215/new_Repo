package com.jtc.Array;

import java.util.*;

public class UnionofTwoArrays {
public static void main(String[] args) {
	int[] arr1= {1,2,3,4,5};
	int[] arr2= {1,2,5,6,7};
	List<Integer> y=Union(arr1, arr2);
	for(int z:y) {
		System.out.print(z+"");
	}
}
 static List<Integer> Union(int[] arr1,int[] arr2) {
	 Set<Integer> freq=new HashSet<Integer>();
	 List<Integer> union=new ArrayList<Integer>();
	 for(int i=0;i<arr1.length;i++) {
			 freq.add(arr1[i]);
	 }
	 for(int i=0;i<arr2.length;i++) {
		 freq.add(arr2[i]);
	 }
	 for(int x:freq) {
		union.add(x);
		
	 }
	 return union;
 }
}
