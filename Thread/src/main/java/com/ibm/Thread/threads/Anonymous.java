package com.ibm.Thread.threads;

 
	
	public static void workload() {
		
	}
	 

 public class Anonymous {
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



