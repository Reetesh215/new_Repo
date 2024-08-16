package com.jtc.p15;
interface  I1{
	int a=10;
	void m1();
	void m2();
	 default void m3() {
		System.out.println("Default method in I1");
	}
	static void m4() {
		System.out.println("M4 in Hello");
	}
}
class m5 implements I1{
	public void m1() {
		System.out.println("M1 in Hai");
	}
	public void m2() {
		System.out.println("M2 in hai");
	}
	public void m3() {	
		System.out.println("M3 in Hai");
	}
	
}
public class Jtc9 {
public static void main(String[] args) {
	I1 i1=new m5();
	i1.m1();
	i1.m2();
	i1.m3();
	//i1.m4();
}
}
