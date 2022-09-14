package com.java;

import java.util.HashSet;

public class Hash1 {
public static void main(String args[]) {
	HashSet<String>obj=new HashSet<String>();
	obj.add("one");
	obj.add("two");
	obj.add("three");
	obj.add("four");
	obj.add("one");
	obj.add("Salman");
	System.out.println(obj);
}
}
