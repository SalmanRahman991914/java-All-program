package com.java;

import java.util.ArrayList;

public class Arraylistforloop {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	for(int a=0;a<list.size();a++) 
		System.out.println(list.get(a));
}
}
