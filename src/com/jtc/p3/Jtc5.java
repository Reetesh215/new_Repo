  package com.jtc.p3;
class Hello{
	int a=10;
	int b=20;
	static int c;
	final int d;
	{
		d=10;
	}
	final static int e;
	static{
		e=20;
	}
}
public class Jtc5 {
public static void main(String[] args) {
	System.out.println(Hello.c);
}
}
