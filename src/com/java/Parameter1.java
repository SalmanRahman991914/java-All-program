package com.java;

public class Parameter1 {
int id;
String name;
int age;
Parameter1(int i,String n){
id=i;
name=n;
}
Parameter1(int i,String n,int a ){
id=i;
name=n;
age=a;
}
void eat() {
System.out.println(id+""+name+""+age);	
}
public static void main(String[] args) {
	

Parameter1 obj=new Parameter1(111,":Salman");
Parameter1 obj1=new Parameter1(112,":Rahman",21);
obj.eat();
obj1.eat();
}
}