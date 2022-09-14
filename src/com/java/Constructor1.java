package com.java;

public class Constructor1 {
int id;
String name;

Constructor1(int i,String n){
	id=i;
	name=n;
}



void show() {
	System.out.println(id+" "+name);

}
public static void main(String[] args) {
	Constructor1 c=new Constructor1(1,":salman");
	c.show();
}
}
