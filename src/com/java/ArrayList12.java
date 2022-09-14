package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList12 {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("Salman");
	list.add("Salman");
	list.add("Salman");
	list.add("Rahman");
	list.add("Rahman");
	list.add("Rahman");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(32);
		list1.add(33);
		list1.add(34);
		list1.add(34);
		Iterator<Integer>itr1=list1.iterator();
		while(itr1.hasNext()) {
	System.out.println(itr1.next());		
		}
		
	}
}
}
