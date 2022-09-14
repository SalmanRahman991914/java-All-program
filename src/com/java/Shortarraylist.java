package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Shortarraylist {
public static void main(String[] args) {
	ArrayList <String>list=new ArrayList  <String>();
	list.add("Cat");
	list.add("banana");
	list.add("apple");
	Collections.sort(list);
	for(String a:list) 
		System.out.println(a);
		System.out.println("sorting number");
		ArrayList<Integer>list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(15);
		list2.add(10);
		list2.add(10);
		Collections.sort(list2);
		for(Integer b:list2) 
			System.out.println(b);
		}
}
