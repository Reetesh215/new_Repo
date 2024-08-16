package com.jtc.p12;
class Hello{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in Hello");
	}
	static {
		System.out.println("SB in Hello");
	}
	Hello(int a,int b,int c){
		this(5451,877);
		System.out.println("3 param constructor in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
	Hello(int a,int b){
		this(22);
		System.out.println("2 param const in Hello");
		this.a=a;
		this.b=b;
	}
	Hello(int a){
		this();
		//this(26723);
		System.out.println("1 param constructor in Hello");
		this.a=a;
	}
     Hello(){
		//this(999);
		System.out.println("Default const in Hello");
	}
	void show() {
		System.out.println("show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Jtc {
public static void main(String[] args) {
	Hello h1=new Hello(99,88,77);
	   h1.show();
}
}
