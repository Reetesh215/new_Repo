package com.jtc.p11;
class Hello{
	{
		System.out.println("IB in Hello");
	}
	static {
		System.out.println("SB in Hello");
	}
	Hello(){
		System.out.println("Default const in Hello");
	}
	Hello(Hello h){
		System.out.println("1 param const in Hello");
	}
	Hello(Hello h1,Hello h2){
		System.out.println("2 param const in Hello");
	}
}
public class Jtc {
public static void main(String[] args) {
	Hello h1=new Hello();
	Hello h2=new Hello(null);
	Hello h3=new Hello(new Hello(new Hello(new Hello(new Hello(),new Hello()))));
}
}
