package com.ibm.OOPS.payroll;

public class Application {
	public static void main(String[] args) {
//		Employee employee =new Intern();//upcasting
//		employee.salary();
//		Employee employees =new Confirmed();//upcasting
//		employees.salary();
		
		HR hr=new HR();
		Finance finance=new Finance();
		Employee employee=hr.recuiter("i");
		if(employee !=null) {
			finance.processSalary(employee);
		}
		 employee=hr.recuiter("c");
		if(employee !=null) {
			finance.processSalary(employee);
		}
		employee=hr.recuiter("F");
		if(employee !=null) {
			finance.processSalary(employee);
		}	
	}

}
