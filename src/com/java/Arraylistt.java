package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylistt {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<String>();
	list.add("one");
	list.add("one");
	list.add("one");
	list.add(null);
	list.add(null);
	list.add(null);
	Iterator<String>a=list.iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}
}
}
