package com.jtc.Reflection1;
import java.lang.reflect.*;
class Hello{
	public void show() {
		System.out.println("show");
	}
	public void m1(String s1,String s2) {
		System.out.println("m1");
		System.out.println(s1);
		System.out.println(s2);
	}
	public void m2(int x,int y) {
		System.out.println("m2");
		System.out.println(x);
		System.out.println(y);
	}
}
public class Jtc {
public static void main(String[] args)throws Exception {
	Class cls = Class.forName("com.jtc.Reflection1.Hello");
	Hello h1=(Hello)cls.newInstance();
	//Invoking Method Dynamically
	Method[] dm = cls.getDeclaredMethods();
	for(int i=0;i<dm.length;i++) {
		if(dm[i].getName().equals("show")) {
			dm[i].invoke(h1, null);
		}
		if(dm[i].getName().equals("m1")) {
			dm[i].invoke(h1, "jtc1","jtc2");
		}
		if(dm[i].getName().equals("m2")) {
			dm[i].invoke(h1, 99,88);
		}
	}
}
}
