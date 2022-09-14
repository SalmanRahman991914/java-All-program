package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistnongeneric {
public static void main(String[] args) {
	List<String>list=new ArrayList();
	list.add("java");
	list.add("hello");
	list.add("hello program");
	for(int a=0;a<list.size();a++) {
	System.out.println(list.get(a));
}
}
}
