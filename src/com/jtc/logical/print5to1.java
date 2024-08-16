package com.jtc.logical;

public class print5to1 {
	static void print(int x) {
		if(x>0) {
			System.out.print(x);
			print(x-1);
		}
	}
public static void main(String[] args) {
	print(5);
}
}
