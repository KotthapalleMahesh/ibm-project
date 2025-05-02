package com.ibm.OOPS.payroll;

public class Finance {
	

	public void processSalary(Employee employee) {
		employee.salary();
		if(employee instanceof Confirmed) {
			Confirmed confirmedemployee=(Confirmed) employee;
			confirmedemployee.Transpotation();
			
		}
		
	}

}
