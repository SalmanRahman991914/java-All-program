package com.logic;

import java.util.Scanner;

public class Scanner_input {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the name");
	String a;
	a=obj.nextLine();
	
	System.out.println("enter the address");
	String b;
	b=obj.nextLine();
	
	
	System.out.println("enter the number");
	Long c;
	c=obj.nextLong();
	
	System.out.println("enter the pincode");
	int d;
	d=obj.nextInt();
	
	System.out.println("enter the password");
    String  e;
	e=obj.next();
    
    System.out.println("___________________________");
    System.out.println("your name is:" +a);
    System.out.println("your address is:" +b);
    System.out.println("your number is:" +c);
    System.out.println("your pincode is:" +d);
    System.out.println("your password is:" +e);
    
 }

}
