package com.jtc.Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOftwoArrays2 {
public static void main(String[] args) {
	int[] arr1= {1,2,3,3,4,5,6};
	int[] arr2= {2,3,3,5,6,6,7};
	List<Integer> inter=intersection(arr1, arr2);
	for(int ans:inter)
		System.out.print(ans+"");
}
static List<Integer> intersection(int[] arr1,int[] arr2){
	List<Integer> ans=new ArrayList<Integer>();
	int i=0,j=0;
	while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			i++;
		}else if(arr1[i]>arr2[i]) {
			j++;
		}else {
			ans.add(arr1[i]);
				i++;
				j++;
			
		}
	}
	return ans;
}
}

