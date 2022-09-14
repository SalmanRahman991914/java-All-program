package com.java;

public class Defaultc {
int id;
String name;
	void eat() {
	System.out.println(id+""+name);
}
public static void main(String[] args) {
	 Defaultc s1=new  Defaultc();
	 Defaultc s2=new  Defaultc();
	 s1.eat();
	 s2.eat();
}
}
