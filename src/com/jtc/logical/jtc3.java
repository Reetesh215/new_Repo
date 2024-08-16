package com.jtc.logical;
class Hai{
	int a=10;
	int b=20;
	static int c=30;
	 void m1() {
		 System.out.println("M1 in Hello");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	 }
	 static void m2(Hai h1) {
		 System.out.println("M2 in Hello");
		 //System.out.println(a);
		 //System.out.println(b);
		 System.out.println(c);
		 System.out.println(h1.a);
		 System.out.println(h1.b);
		 System.out.println(h1.c);
	 }
}
public class jtc3 {
 public static void main(String[] args) {
	//Hai h1=new Hai();
	  //h1.m1();
	  Hai.m2(new Hai());
}
}
