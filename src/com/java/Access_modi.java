package com.java;

public class Access_modi {
 public void eat() {
	System.out.println("eating_______");
}
}
class Dog extends Access_modi{
	void bark() {
		System.out.println("barking________");
	}
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.bark();
		obj.eat();
	}
}

