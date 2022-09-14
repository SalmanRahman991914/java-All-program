package com.java;

public abstract class Abstractpro {
	abstract void eat();
}
class Animal extends Abstractpro{
	void eat() {
		System.out.println("hello");
	}

public static void main(String[] args) {
	Animal obj=new Animal();
	obj.eat();
}
}
