package com.jtc.p15;
 class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB in Hello");
		System.out.println(this);
	}
	static {
		System.out.println("static block in Hello");
	}
	Hello(){
		System.out.println("Default Constructor in Hello");
	}
	Hello(int a,int b){
		System.out.println("2 param const in Hello");
		this.a=a;
		this.b=b;
	}
	//protected abstract void m1();
	void m2() {
		int a=10;
		int b=20;
		int c=30;
		System.out.println("m2 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this);
	}
	void m3() {
		System.out.println("use of static method in Abstract Class");
	}
}
class Hai extends Hello{
	int a;
	int b;
	static int c=60;
	{
		System.out.println("IB in Hai");
		System.out.println(this);
	}
	Hai(){
		System.out.println("Default const in Hai");
	}
	Hai(int a,int b){
		super(777,666);
		System.out.println("2 param const in Hai");
		this.a=a;
		this.b=b;	
	}
	void show() {
		int a=101;
		int b=202;
		int c=303;
		System.out.println("show in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Hai class level variable");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println("Hello class level variable");
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
	public void m1() {
		System.out.println("m1 in Hai");
	}
	public void m3() {
		System.out.println("M3 in Hai");
	}
	static void m4() {
		System.out.println("m4 in Hai");
	}
}
public class Jtc118 {
public static void main(String[] args) {
	Hello h1=null;
	h1=new Hai();
	//h1.show();
	h1.m2();
}
}
