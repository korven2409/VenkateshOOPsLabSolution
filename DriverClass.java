package com.greatlearning.service;
import com.greatlearning.model.Employee;
import java.util.Scanner;
public class DriverClass {
	public static void main(String args[])
	{
		Employee employee = new Employee("korada" , "venkatesh");
		String generatedEmail;
		char[] generatedPassword = new char[8];
		CredentialService cService = new CredentialService();
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("Please enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		choice = scan.nextInt();
		if(choice == 1)
		{
			generatedEmail = cService.generateEmailAdress(employee.getFirstName(), employee.getLastName(), "Technical" );
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if(choice == 2)
		{
			generatedEmail = cService.generateEmailAdress(employee.getFirstName(), employee.getLastName(), "Admin" );
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else if(choice == 3)
		{
			generatedEmail = cService.generateEmailAdress(employee.getFirstName(), employee.getLastName(), "Human Resource" );
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else
		{
			generatedEmail = cService.generateEmailAdress(employee.getFirstName(), employee.getLastName(), "Legal" );
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail, generatedPassword);
		}
	}
	
}
