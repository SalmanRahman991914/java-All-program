package com.string_all;

public class String_method {
public static void main(String[] args) {
	String a="java";
	String b="java";
	String c=new String("java");
	String d=new String("hello");
	String e=new String("java");
	
	
	
	System.out.println(a.equals(b));//true
	System.out.println(a.equals(c));//true
	System.out.println(a.equals(d));//false
	System.out.println(a.equals(e));//true
    System.out.println(c.equals(e));//true
}
}
