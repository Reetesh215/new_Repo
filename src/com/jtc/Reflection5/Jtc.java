package com.jtc.Reflection5;
import java.io.DataInputStream;
import java.lang.reflect.*;

public class Jtc {
public static void main(String[] args) throws Exception {
	if(args.length !=1) {
		System.out.println("provide the fully qualified class name as CLA");
		System.exit(0);
	}
	DataInputStream dis = new DataInputStream(System.in);
	String className=args[0];
	Class cls = Class.forName(className);
	Constructor[] cons = cls.getConstructors();
	for(int i=0;i<cons.length;i++) {
		Constructor c=cons[i];
		Class[] cParams = c.getParameterTypes();
		Object objArg[]=new Object[cParams.length];
		for(int j=0;j<cParams.length;j++) {
			Class p=cParams[i];
			String type = p.getSimpleName();
			System.out.println("Enter Value of Type\t:"+type);
			String val=dis.readLine();
			if(type.equals("boolean"))
				objArg[i]=new Boolean(val);
			else if(type.equals("byte"))
				objArg[i]=new Byte(val);
			else if(type.equals("short"))
				objArg[i]=new Short(val);
			else if(type.equals("char"))
				objArg[i]=new Character(val.charAt(0));
			else if(type.equals("int"))
				objArg[i]=new Integer(val);
			else if(type.equals("long"))
				objArg[i]=new Long(val);
			else if(type.equals("float"))
				objArg[i]=new Float(val);
			else if(type.equals("double"))
				objArg[i]=new Double(val);
			else if(type.equals("String"))
				objArg[i]=val;
			else {
				objArg[i]=p.newInstance();
			}
		}
		Object obj=c.newInstance(objArg);
		System.out.println(obj);
	}
}
}
