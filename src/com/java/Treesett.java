package com.java;

import java.util.TreeSet;

public class Treesett {
public static void main(String args[]) {
	TreeSet<String>obj=new TreeSet<String>();
	obj.add("one");
	obj.add("two");
	obj.add("three");
	obj.add("four");
	obj.add("one");
	System.out.println(obj);
}
}
