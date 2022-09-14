package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arrayl {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("Salman");
	list.add("Rahman");
	list.add("khan");
	Iterator<String>itr=list.iterator();
System.out.println("java"+list  );
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
