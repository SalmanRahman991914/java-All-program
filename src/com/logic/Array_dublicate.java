
package com.logic;

public class Array_dublicate {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,1,3,2,5,4,3};
	for(int a=0;a<arr.length;a++) {
	for(int b=a+1;b<arr.length;b++) {
		if(arr[a]==arr[b]) {
				System.out.println(arr[b]);
			}
		}
	}
}
}


