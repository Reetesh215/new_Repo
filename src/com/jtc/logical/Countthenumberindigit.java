package com.jtc.logical;

public class Countthenumberindigit {
   public static void main(String[] args) {
	int num=123;
	int sum=0;
	for(int i=0;num!=0;num=num/10) {
		int rem=num%10;
		sum=sum+rem;
		
		
	}
	System.out.println(sum);
}
}
