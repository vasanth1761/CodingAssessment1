package day2Assessment;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeForm {

	public static void main(String[] args) {

		Company insertCompanyDetails=new Company();
		Employee insertEmployeeDetails=new Employee();
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name:");
		String companyName=sc.next();
		sc.nextLine();
		System.out.println("Enter the number of employees");
		int numberOfEmployee=sc.nextInt();
		Employee[] employees = new Employee[numberOfEmployee];
		for(int i=0;i<numberOfEmployee;i++)
		{
			System.out.println("Employee"+i);
			System.out.println("Enter the Employee id:");
			int employeeId=sc.nextInt();
			System.out.println("Enter the Employee name:");
			String employeeName=sc.next();
			sc.nextLine();
			System.out.println("Enter the Employee designation:");
			String designation=sc.next();
			System.out.println("enter the employee salary:");
			double salary=sc.nextDouble();
			employees[i]=new Employee(employeeId,employeeName,designation,salary);
			
			
		}
				
		Company company = new Company(companyName, employees, numberOfEmployee);
        System.out.println("Average salary of the employee is: " + company.getAverageSalary());
        System.out.println("Maximum  salary of the employee is: " + company.getMaxSalary());

        System.out.println("Employees with designation: " );
        String designation1=sc.next();
        try {
			for (Employee user : company.getEmployeesByDesignation(designation1)) {
			    System.out.println(user);
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}


	}

}
