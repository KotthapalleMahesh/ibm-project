package com.ibm.OOPS.payroll;

public class HR {
	public Employee recuiter(String EmpType) {
		if(EmpType.equalsIgnoreCase("i")) {
			Intern intern=new Intern();
			return intern;
			}
		else if(EmpType.equalsIgnoreCase("c")) {
			Confirmed confirmed=new Confirmed();
			return confirmed;
			
		}
		else if(EmpType.equalsIgnoreCase("F")) {
			Confirmed confirmed=new Confirmed();
			return confirmed;
			
		}
		return null;
		
	}

}
