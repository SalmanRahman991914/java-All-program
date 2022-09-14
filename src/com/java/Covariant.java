package com.java;

public class Covariant {
public Object show() {
	System.out.println("i am parent class");
	return null;
}
}
class Aaa extends Covariant{
	public String show() {
		System.out.println("i am child class");
		return null;
	}
	public static void main(String[] args) {
		Aaa obj=new Aaa();
		obj.show();
	}
}

