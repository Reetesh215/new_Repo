package com.jtc.Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOftwoArrays {
public static void main(String[] args) {
	int[] arr1= {1,2,3,3,4,5,6};
	int[] arr2= {2,3,3,5,6,6,7};
	List<Integer> inter=intersection(arr1, arr2);
	for(int ans:inter)
		System.out.print(ans+"");
}
static List<Integer> intersection(int[] arr1,int[] arr2){
	List<Integer> ans=new ArrayList<Integer>();
	int[] visited=new int[arr2.length];
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j] && visited[j]==0) {
				ans.add(arr2[j]);
				visited[j]=1;
				break;
			}else if(arr1[i]<arr2[j])
				break;
		}
	}
	return ans;
}
}
