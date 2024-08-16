package com.jtc.logical;

public class FrequencyofOccurence {
public static void main(String[] args) {
	String s="Reetesh";
	char target='d';
	int count=0;
	for(char ch:s.toCharArray()) {
		if(ch==target) {
			count++;
		}
	}
//	
//	for(int i=0;i<s.length();i++) {
//		if(target==s.charAt(i)) {
//			count++;
//		}
//	}
	System.out.println(count);
}
}
