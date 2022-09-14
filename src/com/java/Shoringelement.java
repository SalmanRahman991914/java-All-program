package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Shoringelement {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("om");
	Collections.sort(list);
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}