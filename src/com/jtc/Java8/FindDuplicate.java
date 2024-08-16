package com.jtc.Java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
public static void main(String[] args) {
	String str="ilovejavaTechie";
	/**Each Character Occurance**/
	  Map<String, Long> collect = Arrays.stream(str.split(""))
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(collect);
	/**Duplicate Element**/
	
	List<String> duplicate = Arrays.stream(str.split("")).collect(
	Collectors.groupingBy(Function.identity(), Collectors.counting()))
	.entrySet().stream().filter(x->x.getValue()>1)
	.map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(duplicate);
	
	/** Find first non repeating character**/
	
	String key = Arrays.stream(str.split("")).collect(
			Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
			.entrySet().stream().filter(x->x.getValue()==1)
			.findFirst().get().getKey();
	System.out.println(key);
	
	/** Second highest no from a given array**/
	
	int[] num= {5,9,11,2,8,21,1,1};
	
	 Integer integer = Arrays.stream(num).boxed()
	.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(integer);
	
	/**Longest String from given Array**/
	
	String[] arr= {"java","SpringBoot","MicroService","Spring"};
	
	String string = Arrays.stream(arr)
	.reduce((input1,input2)->input1.length()>input2.length()?input1:input2).get();
	System.out.println(string);
	
	/**Find element in array which starts with 1**/
	List<String> startsWith1 = Arrays.stream(num).boxed()
	.map(s->s+"").filter(input->input.startsWith("1"))
	.collect(Collectors.toList());
	System.out.println(startsWith1);
	
	//String.join()
	List<String> list = Arrays.asList("1","2","3","4","5");
	String join = String.join("-", list);
	System.out.println(join);
	
	String str1="welcome";
	/**Remove repeating characters**/
	String collect2 = Arrays.stream(str1.split("")).collect(Collectors
	.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	.entrySet().stream().filter(x->x.getValue()==1)
	.map(Map.Entry::getKey).map(String::valueOf)
	.collect(Collectors.joining());
	System.out.println(collect2);
	/**Remove duplicates from array**/
	  Set<Integer> set = Arrays.stream(num).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
	System.out.println(set);
}
}
