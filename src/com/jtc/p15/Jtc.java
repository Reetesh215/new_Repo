package com.jtc.p15;
abstract class Animal{
	public abstract void eating();
	public abstract void sleeping();
}
abstract class Dog extends Animal{
	public void eating() {
		System.out.println("Dog is eating");
	}
}
class myDog extends Dog{
	public void sleeping() {
		System.out.println("MyDog is sleeping");
	}
}
abstract class Cat extends Animal{
	public void eating(){
		System.out.println("Cat is eating");
	}
	public void sleeping() {
		System.out.println("cat is sleeping");
	}
}
class MyCat extends Cat{
	
}
class Animal_Factory{
	static final int DOG=1;
    static final int CAT=2;
    static Animal getAniaml(int a) {
    	Animal ani=null;
    	if(a==1) {
    		ani=new myDog();
    	}else if(a==2) {
    		ani=new MyCat();
    	}
    	return ani;
    }
}
public class Jtc {
public static void main(String[] args) {
	Animal ani=null;
	ani=Animal_Factory.getAniaml(Animal_Factory.DOG);
	show(ani);
	ani=Animal_Factory.getAniaml(Animal_Factory.CAT);
	show(ani);
}
  static void show(Animal ani) {
	  ani.eating();
	  ani.sleeping();
  }
}
