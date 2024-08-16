package com.jtc.Reflection;
import java.lang.reflect.*;
interface I1{
}
interface I2{
}
final class Hello implements I1,I2{
	int a=10;
	int b;
	Hello(){
		
	}
	Hello(int b){
		this.b=b;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Jtc1 {

public static void main(String[] args)throws Exception {
//	Hello h1=new Hello();
//	h1.show();
	Class cls=Class.forName("com.jtc.Reflection.Hello");
	Hello h2=(Hello)cls.newInstance();
	h2.show();
	System.out.println(cls);
	System.out.println(cls.getName());
	System.out.println(cls.getPackageName());
	System.out.println(cls.getPackage());
	System.out.println(cls.getPackage().getName());
	System.out.println(cls.getClassLoader());
	System.out.println(cls.getSuperclass());
	System.out.println(cls.getSuperclass().getName());
	Class[] interfaces = cls.getInterfaces();
	for(int i=0;i<interfaces.length;i++) {
		System.out.println(interfaces[i].getName());
	}
	System.out.println(cls.getModifiers());
	System.out.println(Modifier.PUBLIC);
	System.out.println(Modifier.FINAL);
}
}
