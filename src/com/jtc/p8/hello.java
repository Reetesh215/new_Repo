package com.jtc.p8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hello {
	public static void main(String[] args) {
	       Integer[] a={1,2,3,4,5};
	       Integer[] b={4,5,6,7,8};
	       
	        Set<Integer> set = new HashSet<>(Arrays.asList(a));
	        Integer[] newA = new Integer[a.length - set.size()];
	        Integer[] newB = new Integer[b.length - set.size()];
	        set.retainAll(Arrays.asList(b));
	        
	            	
	            	int index = 0;
	                for (int x : a) {
	                    if (!set.contains(x)) {
	                        newA[index++] = x;
	                    }
	                }
	                int index1 = 0;
	                for (int x : b) {
	                    if (!set.contains(x)) {
	                        newB[index1++] = x;
	                    }
	                }
	            }
	        
	        
	    }

