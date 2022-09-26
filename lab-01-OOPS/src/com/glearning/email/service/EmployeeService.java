package com.glearning.email.service;

import com.glearning.email.model.Employee;


public class EmployeeService {
	

	public void generateEmailAddress(Employee employee) {
		String emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), employee.getDept());
		employee.setEmailAddress(emailAddress);
	}
	
	public Employee saveCredentials(int length, Employee employee) {
		String password = CredentialService.generatePassword(length);
		employee.setPassword(password);
		return employee;
	}
	
	public void printEmployeeDetails(Employee employee) {
		CredentialService.showCredentials(employee);
	}

}
