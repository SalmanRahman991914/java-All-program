package com.java;

public class Instance_block {
void eat() {
	
	System.out.println("eating the food______");
}
{
String a="this is instance block";
System.out.println(a);
}
public static void main(String[] args) {
	Instance_block obj=new Instance_block();
	obj.eat();
}
}
