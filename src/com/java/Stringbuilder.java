package com.java;

public class Stringbuilder {
public static void main(String[] args) {
	StringBuilder a=new StringBuilder("hello");
	StringBuilder b=new StringBuilder("java");
	StringBuilder c=new StringBuilder("hello");
	StringBuilder d=new StringBuilder("hello");
	System.out.println(a.append(":java"));
	System.out.println(b.insert(0,"hello"));
	System.out.println(c);
	System.out.println(d);
	
}
}
