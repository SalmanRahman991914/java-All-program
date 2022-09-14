package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1 {
public static void main(String[] args) {
ArrayList<String>list=new ArrayList<String>();
list.add("apple");
list.add("anik");
list.add("animal");
Collections.sort(list);
for(String a:list) 
	System.out.println(a);
	System.out.println("sorting number");
	ArrayList<Integer>list1=new ArrayList<Integer>();
	list1.add(10);
	list1.add(16);
	list1.add(5);
	Collections.sort(list1);
	for(Integer b:list1) 
		System.out.println(b);
	
}
}


