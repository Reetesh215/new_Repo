package com.jtc.logical;

public class SearchFromString {
public static void main(String[] args) {
	String name="Reetesh";
	char target='s';
	
	System.out.println(search(name, target));
	System.out.println(search1(name, target));
}
static boolean search1(String str,char target) {
	 if(str.length()==0) {
		 return false;
	 }
	 for(char ch:str.toCharArray()) {
		 if(ch==target) {
			 return true;
		 }
	 }
	 return false;
}
 static int search(String str,char target) {
	 if(str.length()==0) {
		 return -1;
	 }
	 for(int i=0;i<str.length();i++) {
		 if(target==str.charAt(i)) {
			 return i;
		 }
	 }
	 return -1;
 }
}
