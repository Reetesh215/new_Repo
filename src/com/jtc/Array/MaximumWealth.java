package com.jtc.Array;

public class MaximumWealth {
public static void main(String[] args) {
	int [][] arr= {{25},{1,2,3},{3,2,1},{7,6,5}};
	System.out.println(Wealth(arr));
}

private static int Wealth(int[][] arr) {
	int max=Integer.MIN_VALUE;
	for(int person=0;person<arr.length;person++) {
		int sum=0;
		for(int account=0;account<arr[person].length;account++) {
			sum=sum+arr[person][account];
		}
		if(sum>max) {
			max=sum;
		}
	}
	return max;
}
}
