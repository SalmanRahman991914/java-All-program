package com.java;

public class Instance {
int a=10;
  void eat() { 
	  System.out.println(a); 
  System.out.println("hello"); }
 
public static void main(String[] args) {
	Instance obj=new Instance();
	obj.eat();
}
}

