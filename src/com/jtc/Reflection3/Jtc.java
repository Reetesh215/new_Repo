package com.jtc.Reflection3;
import java.lang.reflect.*;
class Student{
	public synchronized void show(int ab,String name,boolean valid,long phone) {
	}
	static final public String getName(int id,String email) {
		return "";
	}
	public int showInformation(String email) {
		return 0;
	}
	int[] getStudentIds() {
		return null;
	}
}
public class Jtc {
public static void main(String[] args) throws Exception {
	Class cls = Class.forName("com.jtc.Reflection3.Student");
	Object st = new Student();
	System.out.println(cls.isInstance(st));
	Method[] methods = cls.getDeclaredMethods();
	for(int i=0;i<methods.length;i++) {
		Method m=methods[i];
		System.out.println("\n============================");
		System.out.println(m);
		System.out.println("**Name**\t:"+m.getName());
		Class retType = m.getReturnType();
		System.out.println("**Return Type\t:"+retType.getName());
		System.out.println("Interface\t:"+retType.isInterface());
		System.out.println("Primitive\t:"+retType.isPrimitive());
		System.out.println("Arrays\t:"+retType.isArray());
		Class[] params = m.getParameterTypes();
		for(int j=0;j<params.length;j++) {
			System.out.println(params[j]+",");
		}
		int x=m.getModifiers();
		System.out.println("\nPUBLIC\t:"+Modifier.isPublic(x));
		System.out.println("FINAL\t:"+Modifier.isFinal(x));
		System.out.println("STATIC\t:"+Modifier.isStatic(x));
		System.out.println(Modifier.toString(x));
	}
}
}
