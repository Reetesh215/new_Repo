package com.java.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findMissingNo {
public static void main(String[] args) {
	int[] arr1={1,3,5,4,7,8};
   int n = Arrays.stream(arr1).max().orElse(0);
   Set<Integer> set=new HashSet<Integer>();
   for(int j=1;j<=n;j++) {
	   set.add(j);
   }
   for(int num:arr1) {
	   set.remove(num);
   }
   System.out.println(set);
   Set<Integer> number = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
   Set<Integer> missing = IntStream.rangeClosed(1, n).boxed()
   .filter(num->!number.contains(num))
   .collect(Collectors.toSet());
   System.out.println(missing);
}
}
