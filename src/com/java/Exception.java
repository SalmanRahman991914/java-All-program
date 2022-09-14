package com.java;

public class Exception {
public static void main(String[] args) {
	
	  try {
		  int a=10/0;
		  } 
	  catch(ArithmeticException e) {
		  System.out.println(e);
	  System.out.println("hello java");
	  }
	  finally{
	  System.out.println("finaly block is executed");
	  System.out.println("Dhoni was best pleyer of the cricket");
	  
	  }
	  System.out.println("hello java program");
	 
	String a="java";
	String b="java 1";
	System.out.println(b==a);
	System.out.println(a==b);
	
	}
}

