package com.logic;

public class Febonency {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	//System.out.print(a+" "+b);
	int c;
	
	for(int i=1;i<=5;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	}
}

 