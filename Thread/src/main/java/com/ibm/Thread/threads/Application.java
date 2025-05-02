package com.ibm.Thread.threads;
 class Runner implements Runnable{

	@Override
	public void run() {
		for( int current =0;current <=10;current++) {
			System.out.println(Thread.currentThread() + String.valueOf(current));		
		}	
	}	 
 }

public class Application {
	public static void main(String[] args) {
		Runner runner =new Runner();
		Thread thread1=new Thread(runner);
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
