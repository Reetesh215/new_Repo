package com.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ang {
public static void main(String[] args) {
	String str[]= {"eat","tae","ate","ten","net","abc"};
	List<List<String>> list=angram(str);
	System.out.println(list.toString());
}

private static List<List<String>> angram(String[] str) {
	List<List<String>> lst=new ArrayList<List<String>>();
	Arrays.sort(str);
	
	for(int i=0;i<str.length;i++) {
		List<String> lst1=new ArrayList<String>();
		lst1.add(str[i]);
		for(int j=i+1;j<str.length;j++) {
			if(isangram(str[i],str[j])) {
				lst1.add(str[j]);
			}
		}
		
			lst.add(lst1);
		
	}
	return lst;
}

private static boolean isangram(String string, String string2) {
    if(string.length()!=string2.length()) {
    	return false;
    }
    char[] arr1=string.toCharArray();
    char[] arr2=string2.toCharArray();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    for(int k=0;k<arr1.length;k++) {
    	if(arr1[k]!=arr2[k]) {
    		return false;
    	}
    }
	return true;
}
}
