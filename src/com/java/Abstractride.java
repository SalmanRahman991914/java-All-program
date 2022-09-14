package com.java;

abstract 
class AbstractClass{
abstract void eat();
}
class Animal2 extends Abstractride {
	void eat() {
		System.out.println("hello");
	}
}
class Animal1 extends Abstractride {
	void eat() {
		System.out.println("bye");
	}
	
}
public  class Abstractride {
	public static void main(String[] args) {
		Animal1 obj=new Animal1();
		obj.eat();
	}
}
