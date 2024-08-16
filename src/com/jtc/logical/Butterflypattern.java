package com.jtc.logical;

public class Butterflypattern {
public static void main(String[] args) {
	//upper part
	for(int i=1;i<=4;i++) {
		//left side star
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		//space 
		for(int j=1;j<=2*(4-i);j++) {
			System.out.print(" ");
		}
		//Right side star
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//Lower part
	for(int i=4;i>=1;i--) {
		//left side star
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		//space 
		for(int j=1;j<=2*(4-i);j++) {
			System.out.print(" ");
		}
		//Right side star
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
