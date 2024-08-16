package com.jtc.p7;
class Hello{
	int m1() {
		System.out.println("M1 in Hello");
		return 10;
	}
	static int m2() {
		System.out.println("M2 in Hello");
		return 20;
	}
	//static int i1=m1();
	static int i2=m2();
	int i3=m1();
	int i4=m2();
	static int m3() {
		System.out.println("M3 in Hello");
		return 100;
	}
	static void m4(int a) {
		System.out.println("M4 in Hello");
		System.out.println(a);
	}
}
public class Jtc {
public static void main(String[] args) {
	//Hello h1=new Hello();
	Hello.m2();
	Hello.m4(Hello.m3());
}
}
