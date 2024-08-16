package com.jtc.logical;

public class Jtc7 {
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		for(int j=3;j<=i;j++) {
			if(i%j==0)
				System.out.println(i);
		}
	}
}
}
