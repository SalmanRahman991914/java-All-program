package com.multi_threading;

public class By_implement_ranable implements Runnable {
    public void run() {
    	System.out.println("runnable interface is execute______");
    } 
    public static void main(String[] args) {
    	By_implement_ranable obj=new By_implement_ranable();
    	obj.run();
    	Thread t1=new Thread(obj);
    	t1.start();
	}
}
