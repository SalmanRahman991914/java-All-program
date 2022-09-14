package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Salmanr {
public static void main(String args[]) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("vandana");
	list.add("Deepak");
	list.add("Vandana");
	Iterator<String>itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
