package com.multi_threading;

public class Sleep1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("starting the sleep method  "+  i);
		}
	}
	public static void main(String[] args) {
		Sleep1 obj=new Sleep1();
		obj.start();
	}
}
