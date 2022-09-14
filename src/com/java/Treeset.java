package com.java;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet<String>set=new TreeSet<String>();
	set.add("one");
	set.add("two");
	set.add("three");
	set.add("four");
	
	
	Iterator<String>itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
