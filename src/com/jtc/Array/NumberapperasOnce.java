package com.jtc.Array;
import java.util.*;
public class NumberapperasOnce {
public static void main(String[] args) {
	int[] arr= {1,1,2,3,3,4,4};
	int ans=numberOnce(arr);
	System.out.println(ans);
}
/*
 * static int numberOnce(int[] arr) { int xor=0; for(int i=0;i<arr.length;i++) {
 * xor=xor^arr[i]; } return xor; }
 */
static int numberOnce(int[] arr) {
	Map<Integer, Integer> number=new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++) {
		if(number.containsKey(arr[i])) {
			int count=number.get(arr[i]);
			number.put(arr[i], count+1);
		}else {
			number.put(arr[i], 1);
		}
	}
	for(Map.Entry<Integer, Integer> it:number.entrySet()) { 
		if(it.getValue()==1) { 
			 return it.getKey();
		}
	
	}
	return -1;
}
}
