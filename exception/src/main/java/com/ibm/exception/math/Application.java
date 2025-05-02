package com.ibm.exception.math;

public class Application {
	public static void main(String[] args) {
		
			System.out.println("start");
			
			Arithmetic arithmetic=new Arithmetic();
			assert(arithmetic.sum(10, 5) ==15): "sum method is not proper";
			System.out.println("end");
		
	}

}
