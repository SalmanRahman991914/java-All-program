package com.java;

public class Parameter {
int id;
String name;
String collage;
char c;
 Parameter(int i,String n,char c){
	id=i;
	name=n;
	c=c;
	
 }
void eat() {
System.out.println(id+""+name+""+'c');
}
public static void main(String args[]) {
	Parameter s1=new Parameter(111," Salman",'j');
	Parameter s2=new Parameter(112," Rahman",'k');
	Parameter s3=new Parameter(113," Nehal",'l');
	s1.eat();
	s2.eat();
	s3.eat();
}
}
