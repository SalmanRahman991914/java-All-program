package com.java;

 class SuperKey {
int a=100;
}
public class B11 extends SuperKey{
	int a=50;
	void eat() {
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		B11 obj=new B11();
		obj.eat();
	}
	}
	  

