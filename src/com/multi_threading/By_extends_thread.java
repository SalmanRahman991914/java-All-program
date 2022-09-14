package com.multi_threading;

public class By_extends_thread extends Thread{
	public void run() {
		System.out.println("horse is running_______");
	}
	public static void main(String[] args) {
		By_extends_thread obj=new By_extends_thread();
		obj.run(); 
		obj.start();
		
	}
}
