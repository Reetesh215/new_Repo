package com.jtc.p4;
class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB1 in Hello");
	}
	static {
		System.out.println("SB1 in Hello");
	}
	{
		System.out.println("IB2 in Hello");
	}
	static {
		System.out.println("SB2 in Hello");
	}
}

public class Jtc {
   int aa=10;
   static int bb=20;
   {
	   System.out.println("IB in Jtc");
	   System.out.println(aa);
	   System.out.println(bb);
   }
   static {
	    System.out.println("SB in JTC");
	    //System.out.println(aa);
	    System.out.println(bb);
   }
   public static void main(String[] args) {
	System.out.println("Main In JTC");
	System.out.println(Hello.c);
	Hello h1=new Hello();
	Hello h2=new Hello();
	Jtc j=new Jtc();
   }
}
