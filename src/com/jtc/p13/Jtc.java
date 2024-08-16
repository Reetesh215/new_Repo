package com.jtc.p13;
class Hai{
	static Hello h1=new Hello();
}
class Hello{
	  Hello(){
		  this(new Hello(null));
		  System.out.println("Default const in Hello");
		  System.out.println(this);
	  }
	  Hello(Hello h1){
		  System.out.println("1 param const in Hello");
	  	  }
	  Hello(Hello h1, Hello h2){
		  System.out.println("2 param const in Hello");
		  
	  }
}
public class Jtc {
public static void main(String[] args) {
	Hello h1=new Hello();
	   System.out.println(h1);
}
}
