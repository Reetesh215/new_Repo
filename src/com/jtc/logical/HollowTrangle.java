package com.jtc.logical;

public class HollowTrangle {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(int K=1;K<=(2*i-1);K++) {
			if(K==1||K==(2*i-1)||i==5) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
