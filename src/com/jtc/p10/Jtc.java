package com.jtc.p10;
class Hello{
	int a;
	final int b;
	static final int c;
	/*
	 * { System.out.println("IB in Hello"); b=200; c=300; }
	 */
	static {
		System.out.println("SB in Hello");
		//b=300;
		c=100;
	}

	
	/*
	 * Hello(){ System.out.println("Default const in Hello"); }
	 */
	Hello(int a1){
		System.out.println("1 parm const in Hello");
		b=a1;
	}
	void m1() {
		System.out.println("M1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Jtc {
public static void main(String[] args) {
//	Hello h1=new Hello();
//	    h1.m1();
	Hello h2=new Hello(111);
	    h2.m1();
	Hello h3=new Hello(222);
	    h3.m1();
}
}
