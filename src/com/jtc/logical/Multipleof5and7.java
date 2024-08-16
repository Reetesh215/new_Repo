package com.jtc.logical;

public class Multipleof5and7 {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		int num =(5*i);
		if(num%5==0&&num%7==0) {
			System.out.println(num);
		}
	}
}
}
