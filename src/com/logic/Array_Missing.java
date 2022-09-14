package com.logic;

public class Array_Missing {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,7};
	int expect=arr.length+1;
	int total_sum=expect*(expect+1)/2;
	System.out.println(total_sum);
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("missing no is : "+(total_sum-sum));
}
}
