package com.java;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
public static void main(String args[]) {
	Stack<String>list=new Stack<String>(); 
	
	list.push("Amir");
	list.push("Anas");
	list.push("Aman khan");
	list.push("item");
	list.push("item1");
	list.push("banana");
list.pop();
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}

