package com.jtc.logical;

public class EvenDigits {
public static void main(String[] args) {
	int[] nums= {12,345,2,6,745,7896};
	System.out.println(Findnumber(nums));
}
  static int Findnumber(int[] arr) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {
		  if(even(arr[i]))
			  count++;
	  }
	  return count;
  }
private static boolean even(int i) {
	int numberofDigits=digits(i);
	return numberofDigits%2==0;
}
static int digits(int i) {
	int count=0;
	while(i>0) {
		count++;
		i=i/10;
	}
	return count ;
}
}
