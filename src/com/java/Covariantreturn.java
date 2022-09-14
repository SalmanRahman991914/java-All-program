package com.java;

 class Covariantreturn {
	Covariantreturn show() {
		
		System.out.println("hello");
		return this;
	}	
}
class Covariant1 extends Covariantreturn{
	@Override 
	Covariant1 show() {
		
		System.out.println("hii");
		return this;
	}
	public static void main(String[] args) {
		Covariant1 obj=new Covariant1();
		obj.show();
	}
	
}
