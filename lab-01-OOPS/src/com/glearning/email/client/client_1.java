package com.glearning.email.client;
import java.util.Scanner;
import com.glearning.email.model.Employee;
import com.glearning.email.service.EmployeeService;

public class EmailServiceClient {
	private static EmployeeService employeeService = new EmployeeService();
          
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name");
		String firstName = scanner.next();

		System.out.println("Please enter last name");
		String lastName = scanner.next();

		System.out.println("Select your department");
		System.out.println("1. Admin 2. HR 3. Technical 4. Legal ");
		String dept = scanner.next();
		Employee newHire= null;
			newHire = new Employee(firstName, lastName);
		newHire.setDept(dept);
		employeeService.generateEmailAddress(newHire);

		System.out.println("Enter your options from the following:: ");
		System.out.println("1 -> Generate Password ");
		System.out.println("2 -> Show Details ");

		int option = scanner.nextInt();

		switch (option) {
		case 1:
			employeeService.saveCredentials(8, newHire);
			employeeService.printEmployeeDetails(newHire);
			break;
		case 2:
			employeeService.printEmployeeDetails(newHire);
			break;
		}
		
		scanner.close();
	}
}
