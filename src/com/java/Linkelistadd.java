  package com.java;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkelistadd {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<String>();
	Collections.addAll(list,"Naseem","Asadullah","Salman","Razzak","Rahman");
	
	System.out.println(list);
	System.out.println("-----------------");
	LinkedList<String>list1=new LinkedList<String>();
	
	Collections.addAll(list1,"Redmi mibile");
	System.out.println(list1);
	System.out.println("--------------");
	
	System.out.println("------------");
	LinkedList<String>list2=new LinkedList<String>();
	Collections.addAll(list2,"Java","Python");
	System.out.println(list2);
	list.addAll(list2);
	System.out.println(list);
	System.out.println("--------------");
}
}
