package com.java;

 class A34 {
void m1() {
	System.out.println("hii");
}
}
class B extends A34{
	void m2() {
		System.out.println("bye");
	}
}
class C extends B{
	void m3() {
		System.out.println("hello");
	}
}
class D extends C{
	void m4() {
		System.out.println("hii hii");
	}
}
class E extends D{
	void m5() {
		System.out.println("bye all");
	}
}
class F extends E{
	void m6() {
		System.out.println("hello all");
	}
}
class G extends F{
	void m7() {
		System.out.println("hiii");
	}
}
class H extends G{
	void m8() {
		System.out.println("byee");
	}
}
class I extends H{
	void m9() {
		System.out.println("hellooo");
	}
}
class Multilevel extends I{
	void m10() {
		System.out.println("hellllooo");
	}
	public static void main(String args[]) {
	Multilevel obj=new Multilevel();
	obj.m10();
	}
}