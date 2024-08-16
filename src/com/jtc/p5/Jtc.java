package com.jtc.p5;
class Hello{
	int a;
	static int c;
	{
		System.out.println("IB in Hello");	
	}
	static {
		System.out.println("SB in hello");
	}
	void m1() {
		System.out.println("M1 in hello");
	}
	static void m2() {
		System.out.println("M2 In Hello");
	}
}
public class Jtc {
	{
		System.out.println("IB in Jtc");
	}
	static {
		System.out.println("SB in Jtc");
	
	try {
	    Jtc j=(Jtc) Class.forName("Jtc").newInstance();
	}catch(Exception e) {
		
	}
	}
	public static void main(String[] args)throws Exception {
		
		Class cls=Class.forName("Hello");
		String str=cls.getName();
		System.out.println(str);
		if(str.equals("Hello")) {
			System.out.println("Class Hello is loaded");
		}else {
			System.out.println("Class Hello is Not Loaded");
		}
		Hello h1=(Hello)cls.newInstance();
		
			
		
		System.out.println(Hello.c);
	}
}
