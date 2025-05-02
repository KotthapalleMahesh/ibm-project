package com.ibm.Enum;
import java.util.Arrays;

enum Apple {
	Kashmir(10), Green(20), RedDel(30);
	private  int price;
	
	Apple(int price) {
        this.price = price;
    }
	
	public int getprice() {
		return price;
}}

public class Application {
	public static void main(String[] args) {
		Apple apples=Apple.Green;
		System.out.println(apples);
		
//		 apple=Apple.valueOf("Green");
//		System.out.println(apple);
		
		Apple[] applee=Apple.values();
		for(Apple appl:applee) {
		System.out.println(appl + " costs "+ appl.getprice());
		
		
		}
		
	}
	
	
}

