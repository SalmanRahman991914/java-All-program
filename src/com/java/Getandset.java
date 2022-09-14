package com.java;

import java.util.ArrayList;

public class Getandset {
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList<String>();
	a.add("one");
	a.add("two");
	a.add("three");
	System.out.println("java :"+a.get(1));
	a.set(2,"hello");
	for(String b:a) {
		System.out.println(b);
	}
		
		
}
}

