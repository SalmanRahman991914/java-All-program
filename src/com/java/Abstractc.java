package com.java;

 abstract class Abstractc {
Abstractc(){
	System.out.println("hello");
}
}
class A extends Abstractc{
	void eat() {
	System.out.println("bye");
}
}
class Bb extends Abstractc{
	void eat() {
		System.out.println("java");
	}
	
public static void main(String args[]) {
Bb obj=new Bb();
obj.eat();
}
}
