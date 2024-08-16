package com.jtc.p2;
class Hello{
	int a=10;
	int b=20;
	static int c=30;
	void m1() {
		int aa=11;
		//static int bb=22;
		System.out.println("M1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(aa);
		//System.out.println(bb);
	}
	static void m2() {
		int ab=101;
		//static int bc=202;
		System.out.println("M2 in Hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(ab);
		//System.out.println(bc);
	}
}
public class Jtc4 {
 public static void main(String[] args) {
	Hello h1=new Hello();
	   h1.m1();
	   h1.m2();
}
}
