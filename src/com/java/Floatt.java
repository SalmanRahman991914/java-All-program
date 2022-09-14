package com.java;

public class Floatt {
public static void main(String[] args) {
	try {
	float a=35/0;
	}
	catch(ArithmeticException e) {
	System.out.println(e);
}
}
}