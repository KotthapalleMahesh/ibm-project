package com.ibm.exception;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first value");
		System.out.println("enter the Second value");
		sc.next();
		String  firstParam=null;
		String secondParam=null;
		try {
			firstParam=args[0];
			secondParam=args[1];
//			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
			try {
				System.out.println(Integer.parseInt(firstParam)/Integer.parseInt(secondParam));
				
			}
			catch(NumberFormatException exception) {
				System.out.println("Nested Catch");
			}
		}
		catch(ArrayIndexOutOfBoundsException  |NumberFormatException ex ) {
			System.out.println("Run the program supplying a number " );
			
		}
		catch(ArithmeticException ex) {
			System.out.println("you cannot divide with 0");
			
		}
		
		System.out.println("end");
	}

}
