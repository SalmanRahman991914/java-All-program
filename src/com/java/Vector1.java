package com.java;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Vector1 {
	public static void main(String args[]) {
	Stack<String>list=new Stack<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("one");
	list.add("Salman");
	list.add("Rahman");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
