package com.java;

import java.util.Iterator;
import java.util.Vector;

public class Vectorprogram {
public static void main(String[] args) {
	Vector<String>list=new Vector<String>();
	list.add("salman");
	list.add("rahman");
	list.add("Khan");
	list.add("khan");
	list.add("khan");
	list.addElement("Naseem");
	list.addElement("Asadullah");
	Iterator<String>a=list.iterator();
	while(a.hasNext()) {
		System.out.println( "Elements are : " +a.next());
	}
}
}
