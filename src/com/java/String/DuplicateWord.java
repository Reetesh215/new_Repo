package com.java.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateWord {
public static void main(String[] args) {
	 String s = "my name is reetesh and reetesh like coding";
	 String[] str=s.toLowerCase().split(" ");
	 Map<String, Integer> map=new HashMap<>();
	 for(String str1:str) {
		 map.put(str1, map.getOrDefault(str1,0)+1);
	 }
	 for(String word:str) {
		 if(map.get(word)>1) {
			 System.out.println(word);
			 map.put(word, 0);
		 }
	 }
	 
	 Set<String> duplicateWord = Arrays.stream(str).collect(Collectors.
	groupingBy(Function.identity(), Collectors.counting()))
	 .entrySet().stream().filter(input->input.getValue()>1)
	 .map(Map.Entry::getKey).collect(Collectors.toSet());
	 System.out.println(duplicateWord);
	 
}
}
