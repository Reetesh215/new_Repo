package com.jtc.Reflection2;
import java.io.Serializable;
import java.lang.reflect.*;
import java.security.PublicKey;
interface Inter1{}
interface Inter2{}
interface Inter3{}
class User{
	public String username;
	String password;
	public String name;
	public class Ab{}
	class Bc{}
}
class Student extends User implements Inter1,Inter2,Inter3,Cloneable,Serializable{
	private String batchId;
	public String batchTimings;
	int sid;
	Student(int ab){}
	private Student(int ab,String nm) {}
	public Student(int ab,long phone) {}
	protected Student(int ab,boolean registered) {}
	public Student(int ab,String nm,long phone) {}
	protected Student(String nm,float fee) {}
	Student(String nm){}
	class A{}
	public class B{}
}
public class Jtc {
public static void main(String[] args)throws Exception {
	Class cls = Class.forName("com.jtc.Reflection2.Student");
	System.out.println("***INTERFACE***");
	Class[] interfaces = cls.getInterfaces();
	for(int i=0;i<interfaces.length;i++) {
		System.out.println(interfaces[i]);
	}
	System.out.println("***PUBLIC CONSTRUCTOR***");
	Constructor[] constructors = cls.getConstructors();
	for(int i=0;i<constructors.length;i++) {
		System.out.println(constructors[i]);
	}
	System.out.println("***Declared Constructor***");
	Constructor[] decCons = cls.getDeclaredConstructors();
	for(int i=0;i<decCons.length;i++) {
		System.out.println(decCons[i]);
	}
	System.out.println("***Public Field***");
	Field[] pubfields = cls.getFields();
	for(int i=0;i<pubfields.length;i++) {
		System.out.println(pubfields[i]);
	}
	System.out.println("***Declared Field***");
	Field[] decdFlds = cls.getDeclaredFields();
	for(int i=0;i<decdFlds.length;i++) {
		System.out.println(decdFlds[i]);
	}
	System.out.println("***Public Classes***");
	Class[] innClass = cls.getClasses();
	for(int i=0;i<innClass.length;i++) {
		System.out.println(innClass[i]);
	}
}
}
