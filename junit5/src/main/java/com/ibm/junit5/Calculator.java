package com.ibm.junit5;

public class Calculator {
	public int sum(int a,int b) {
		return a+b;
		
	}
	public int divide(int iNum1,int iNum2) {
		return iNum1/iNum2;
		
	}
	 public void getConnection() {
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public  static boolean isEven(int number) {
		 return number %2==0;
	 }
	


	public static void main(String[] args) {
		Calculator calculator=new  Calculator();
		calculator.sum(2, 10);
		calculator.divide(6, 3);
		}
}
