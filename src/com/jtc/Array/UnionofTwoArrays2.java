package com.jtc.Array;

import java.util.ArrayList;
import java.util.List;

public class UnionofTwoArrays2 {
public static void main(String[] args) {
	int[] arr1= {1,2,3,4,5};
	int[] arr2= {1,1,2,3,6,7};
	List<Integer> result=Union(arr1, arr2);
	for(int res:result) {
		System.out.print(res+"");
	}
}
static List<Integer> Union(int[] arr1,int[] arr2){
	int i=0;
	int j=0;
	List<Integer> unionarr=new ArrayList<>();
	while (i<arr1.length && j<arr2.length) {
	if(arr1[i]<=arr2[j]) {
        if(unionarr.size()==0||unionarr.get(unionarr.size()-1)!=arr1[i]) 
		unionarr.add(arr1[i]);
		i++;

	}
	else {
		if(unionarr.size()==0||unionarr.get(unionarr.size()-1)!=arr2[j])
		unionarr.add(arr2[j]);
		j++;
	}
	}
	while(i<arr1.length) {
		if(unionarr.get(unionarr.size()-1)!=arr1[i])
		unionarr.add(arr1[i]);
		i++;
	}
	while(j<arr2.length) {
		if(unionarr.get(unionarr.size()-1)!=arr2[j])
			unionarr.add(arr2[j]);
		j++;
	}
	
	return unionarr;
}
}
