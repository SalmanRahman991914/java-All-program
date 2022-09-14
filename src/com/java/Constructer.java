package com.java;

public class Constructer {
int id;
String name;
float fee;
Constructer(int i,String n,float f){
	this.id=i;
	this.name=n;
	this.fee=f;
}
void eat() {
	System.out.println(id+""+name+""+fee);
}
public static void main(String[] args) {
	Constructer s1=new Constructer(11,":Salman",500f);
	Constructer s2=new Constructer(12,":Razzak",300f);
	s1.eat();
	s2.eat();
}
}
