package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class Variable {
public static void main(String[] args) {
	
ArrayList<String>list=new ArrayList<String>();

Collections.addAll(list,"salman","Rahman","khan");

list.set(0, "Rahman");
list.set(2, "Amir");
System.out.println(" java"+list.get(0));
System.out.println(list);
}
}
