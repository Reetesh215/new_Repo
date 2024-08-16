package com.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
public static void main(String[] args) {
	String str[]= {"eat","tae","ate","ten","net","abc"};
	List<List<String>> list=anagram(str);

	System.out.println(list.toString());
	
}

private static List<List<String>> anagram(String[] str) {
	Map<String, List<String>> map=new HashMap();
	for(String st:str) {
		char[] ch=st.toCharArray();
		Arrays.sort(ch);
		String st1=new String(ch);
		List<String> list=map.getOrDefault(st1, new ArrayList<String>());
		
		list.add(st);
		map.put(st1, list);
		
	}
	List<List<String>> result = new ArrayList<>(map.values());
	return result;
}
}
