package com.jtc.logical;
class Hello{
	int a =10;
	int b =20;
 static int c =30;
  void m1() {
	  System.out.println("M1 in Hello");
	  int ab=10;
	  int bc=20;
	//static int cd=30;
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(ab);
	  System.out.println(bc);
  }
  static void m2() {
	  System.out.println("M2 in Hello");
	  //System.out.println(a);
	 // System.out.println(b);
	  System.out.println(c);
  }
 }
public class Jtc2 {
public static void main(String[] args) {
	Hello h1=new Hello();
	    h1.m1();
	    h1.m2();
	 System.out.println("Instance Variable");
	 Hello h2=new Hello();
	    System.out.println(h2.a);
	    System.out.println(h2.b);
	   System.out.println(h2.c);
	   System.out.println(new Hello().a);
 }
}
