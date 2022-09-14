package com.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Collectionn {
public static void main(String args[]) {
	LinkedList<String>al=new LinkedList<String>();
	al.add("Salman");
	al.add("Rahman");
	al.add("Anas");
al.add("Khan");
Iterator<String> itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}