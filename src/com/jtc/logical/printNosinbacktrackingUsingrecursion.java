package com.jtc.logical;

public class printNosinbacktrackingUsingrecursion {
	static void numb(int i,int n) {
		if(i<n)
			return;
		numb(i-1,n);
		System.out.println(i);
	}
public static void main(String[] args) {
	numb(5,1);
}
}
