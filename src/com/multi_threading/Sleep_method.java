package com.multi_threading;

public class Sleep_method extends Thread {
  public void run() {
	for(int a=1;a<5;a++) {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(a);
	}
	}
		public static void main(String args[]){
			Sleep_method obj=new Sleep_method();
			obj.start();
   }
}
