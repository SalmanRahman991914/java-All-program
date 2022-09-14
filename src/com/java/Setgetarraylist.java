package com.java;

import java.util.ArrayList;

public class Setgetarraylist {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Apple");
	list.add("banana");
	list.add("mango");
	System.out.println("Grapes:"+list.get(0));
	list.set(1,"Dates");
	for(String a:list) {
		System.out.println(a);
	}
}
}
