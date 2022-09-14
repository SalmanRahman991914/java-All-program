package com.logic;

public class String_dublicate {
public static void main(String[] args) {

	int count=0;
	String a="salmaan";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='a') {
			
			count++;
		}
	}
	System.out.println(count); 
}
}
