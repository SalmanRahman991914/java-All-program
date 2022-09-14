package com.java;

public class Static_block {
static {
	int a=10;
	System.out.println(a);
}
void eat() {
	System.out.println("eating___________");
}
public static void main(String[] args) {
	Static_block obj=new Static_block();
	obj.eat();
}
}
