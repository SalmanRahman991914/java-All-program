package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("123");
	a.add("1234");
	a.add("123");
	a.add("1234");
	a.add("Salman");
	a.add("Naseem tikariya");
	a.add("Rahman");
	for(int b=0;b<a.size();b++) {
		System.out.println(a.get(b));
	}
}
}
