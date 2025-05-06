package com.ibm.practice.staticconcept;

import java.util.Scanner;

public class Static {
	
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers is " + sum);
	}
	static {
		System.out.println("this is static block");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number ");
		int a= (sc.nextInt());
		System.out.println("enter the second number ");
		int b=sc.nextInt();
		Static static1=new Static();
		static1.add(a, b);
		sc.close();
		
	}

}
