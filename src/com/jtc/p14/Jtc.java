package com.jtc.p14;
class A{
	void m11() {
		System.out.println("M11 in A");
	}
	void m12() {
		System.out.println("M12 in Hello");
	}
}
class B extends A{
	void m11() {
		System.out.println("m11 in B");
	}
	void m13() {
		System.out.println("m13 in B");
	}
}
class Hello{
	void m1() {
		System.out.println("m1 in Hello");
	}
	A m2() {
		System.out.println("m2 in Hello");
		return new B();
	}
	B m3() {
		System.out.println("m3 in Hello");
		return (B)m2();
	}
	void m4(int a) {
		System.out.println("m4 in Hello");
	}
}
class Hai extends Hello{
	void m1() {
		System.out.println("m1 in Hai");
	}
	B m2() {
		System.out.println("m2 in Hai");
		return (B)super.m2();
	}
	void m4() {
		System.out.println("M4 in Hai");
	}
	B m5() {
		System.out.println("m5 in Hai");
		return new B();
	}
}
public class Jtc {
public static void main(String[] args) {
	Hello h1=new Hello();
	h1.m1();
	A a1=h1.m2();
	a1.m11();
	a1.m12();
	//a1.m13();
	//(h1.m2()).m13();
}
}
