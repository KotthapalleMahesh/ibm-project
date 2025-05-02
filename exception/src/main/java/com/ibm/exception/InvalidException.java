package com.ibm.exception;
class invalidAgeException extends Exception{
	 @Override
	public String getMessage() {
		
		return "Age should be greater than 18";
	}

	
	 
}
class ElectionVoting{
	 public void register(int age) throws invalidAgeException  {
		 
		if(age<18) {
			 throw  new invalidAgeException();
				
			}
		System.out.println( "registeration completed");
		 
	 }
	

public class InvalidException {
	
	
		
	}
	public static void main(String[] args) {
		ElectionVoting exception =new ElectionVoting();
		try {
			exception.register(17);
		} catch (invalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
