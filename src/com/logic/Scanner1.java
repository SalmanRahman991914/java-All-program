package com.logic;

import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int user=sc.nextInt();
	
	while(user>0) {
	System.out.println(user*user);	
	user=sc.nextInt();
	}
	
}
}
