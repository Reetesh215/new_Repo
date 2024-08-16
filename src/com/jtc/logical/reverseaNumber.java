package com.jtc.logical;

public class reverseaNumber {
public static void main(String[] args) {
	int num=768;
	int rev=0;
	for(int i=0;num!=0;num=num/10) {
		rev=rev*10+(num%10);
	}
	System.out.println(rev);
}
}
