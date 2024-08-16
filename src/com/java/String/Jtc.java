package com.java.String;

import java.util.*;
public class Jtc {
	public static void main(String[] args) {
   String input="aabcccd";
   Map<Character,Integer> map=new HashMap<>();
   for(int i=0;i<input.length();i++) {
	   char c=input.charAt(i);
	   map.put(c,map.getOrDefault(c,0)+1);
   }
   for(char ch:map.keySet()) {
	   System.out.print(ch+""+map.get(ch));
   }
	}

}
