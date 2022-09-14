package com.java;

public class Exceptionn {
public static void main(String[] args) {
	System.out.println("Amir hazrat");
	System.out.println("Suraj Pall");
	try {
		int a=100/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		System.out.println("hello java");
	}
	finally {
		System.out.println("hello program");
		System.out.println("java is aprogramming language");
	}
	System.out.println("rest of the code");
}
}
