package com.jtc.p6;
class Hai{
	void m1() {
		
		
		System.out.println("M1 in Hai");
	}
	static void m2() {
		System.out.println("M2 in Hello");
	}
}
class Hello{
	int m11() {
		System.out.println("M11 in Hello");
		return 10;
	}
	Hai m12() {
		System.out.println("M22 in Hello");
		return new Hai();
	}
	Hai m13(Hai hai) {
		System.out.println("M13 in Hello");
		//hai.m1();
		hai.m2();
		return m12();
	}
	Object m14() {
		System.out.println("M15 in Hello");
		return 111;
	}
	Object m15() {
		System.out.println("M15 in Hello");
		return m13(null);
	}
	static Hai m16() {
		System.out.println("M16 in Hello");
		return new Hai();
	}
	
}
public class Jtc {
  public static void main(String[] args) {
	Hello h1=new Hello();
	int i=h1.m11();
	System.out.println(i);
	Hai hai=h1.m12();
	  hai.m1();
	  Hai hai1=h1.m13(null);
	  System.out.println(hai.hashCode());
	  System.out.println(hai1.hashCode());
	Hai hai2=(Hai)h1.m15();
	  hai2.m1();
	Hai hai3=Hello.m16();
	Hai hai4=Hello.m16();
	System.out.println(hai3.hashCode());
	System.out.println(hai4.hashCode());
}
}
