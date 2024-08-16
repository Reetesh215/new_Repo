package com.jtc.p9;
class Hai{
	static {
		System.out.println("SB in Hai");
		String str[]= {"abc"};
		Jtc.main(str);
	}
	public static void main(String[] args) {
		System.out.println("Main in Hai");
	}
}
public class Jtc {
	static {
		System.out.println("SB in Jtc");
		String str[]= {"abcd"};
		Hai.main(str);
	}
public static void main(String[] args) {
	System.out.println("Main in Jtc");
}
}
