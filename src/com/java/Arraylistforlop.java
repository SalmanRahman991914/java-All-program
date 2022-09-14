package com.java;

import java.util.ArrayList;

public class Arraylistforlop {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("java");
list.add("salman");
list.add("rahman");
list.add("Muazzam");
list.add("Shaikh");
/*
 * System.out.println(list.get(0)); System.out.println(list.get(2));
 */
System.out.println("hello:"+list.get(1));
list.set(0,"hello");
for(String a:list) {
	System.out.println(a);
	

System.out.println();
/*for(int a=0;a<list.size();a++) {
	System.out.println(list.get(a));*/
}
}
}
