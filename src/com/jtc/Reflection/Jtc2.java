package com.jtc.Reflection;
import java.lang.reflect.*;
class Hai{
	public int x=10;
	public void hai() {
		System.out.println("hai");
	}
}
class Hello1 extends Hai{
	public final static int a=10;
	public static int b=20;
	public Hello1() {
	}
	public void show() {
		System.out.println("show");
		System.out.println(a);
		System.out.println(b);
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
public class Jtc2 {
public static void main(String[] args)throws Exception {
	Class cls = Class.forName("com.jtc.Reflection.Hello1");
	Hello1 h1=(Hello1)cls.newInstance();
	h1.show();
	System.out.println(Modifier.PUBLIC);
	System.out.println(Modifier.FINAL);
	System.out.println(Modifier.STATIC);
	//Fields
	System.out.println("---Fields---");
	Field[] fields = cls.getFields();
	for(int i=0;i<fields.length;i++) {
		System.out.println(fields[i].getModifiers()
		+"..."+fields[i].getType()+"..."+fields[i].getName());
	}
	System.out.println("---Declared Fields---");
	//Declared Fields
	Field[] df = cls.getDeclaredFields();
	for(int i=0;i<df.length;i++) {
		System.out.println(df[i].getModifiers()
		+"..."+df[i].getType()+"..."+df[i].getName());
	}
	//Methods
	System.out.println("---Methods---");
	Method[] methods = cls.getMethods();
	for(int i=0;i<methods.length;i++) {
		System.out.println(methods[i].getModifiers()
		+"..."+methods[i].getReturnType()+"..."+methods[i].getName());
	}
	//Decleared Methods
	System.out.println("---Decleared Methods---");
	Method[] dm = cls.getDeclaredMethods();
	for(int i=0;i<dm.length;i++) {
		System.out.println(dm[i].getModifiers()
		+"..."+dm[i].getReturnType()+"..."+dm[i].getName());
	}
	//Constructor
	System.out.println("---Constructor---");
	Constructor[] cons = cls.getConstructors();
	for(int i=0;i<cons.length;i++) {
		System.out.println(cons[i].getModifiers()
		+"..."+cons[i].getName());
	}
	//Invoking Method Dynamically 
	dm=cls.getDeclaredMethods();
	for(int i=0;i<dm.length;i++) {
		
		if(dm[i].getName().equals("m2"))
			dm[i].invoke(h1, 1,2);
	}
}
}
