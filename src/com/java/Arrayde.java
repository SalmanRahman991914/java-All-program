package com.java;

import java.util.ArrayDeque;

public class Arrayde {
public static void main(String args[]) {
	ArrayDeque<String>list=new ArrayDeque<String>();
	list.add("Salman Rahman");
	list.add("Rahman khan");
	list.add("Junaid Khan");
	for(String str:list) {
		System.out.println(str);
	}
}
}
