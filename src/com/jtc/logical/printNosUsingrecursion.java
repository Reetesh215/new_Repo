package com.jtc.logical;

public class printNosUsingrecursion {
	
	void numb(int i,int n) {
		if(i<n)
			return;
		System.out.print(i);
		numb(i+1,n);
	}
public static void main(String[] args) {
	printNosUsingrecursion na=new printNosUsingrecursion();
	na.numb(1, 5);
	
}
}
