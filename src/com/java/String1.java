package com.java;

public class String1 {
public static void main(String args[]) {
	String a="welcome";
	String b="welcome";
	String c="java";
	String d=new String("welcome");
	String e=new String("java");
	String f="java";
	String g="welcome";
	System.out.println(a==b);
	System.out.println(b==c);
	System.out.println(c==a);
	System.out.println(d.equals(b));
	System.out.println(e.equals(c));
	System.out.println(f==a);
	System.out.println(g.equals(d));
}
}
