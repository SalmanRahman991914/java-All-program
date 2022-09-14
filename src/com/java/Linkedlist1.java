package com.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {
public static void main(String args[]) {
	LinkedList<String>list=new LinkedList<String>();
	list.add("one");
	list.add("two");
	list.add("subham");
	list.add("Saroj");
	list.add("one");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
