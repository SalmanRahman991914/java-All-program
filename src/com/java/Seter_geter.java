package com.java;

import java.util.ArrayList;

public class Seter_geter {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");		
		System.out.println("java"+list.get(1));
		list.set( 2, "hello");
		for(String a:list) {
			System.out.println(a);
	}
}
}
