package com.jtc.logical;

public class Numberpatternincrease {
public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(k+" ");
		k++;
		}
		System.out.println();
	}
}
}
