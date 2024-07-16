package day2Assessment;

import java.util.Scanner;



public class Employee1Transport {
	public static int findCountOfEmployeesUsingCompTransport(Employee1[] employees, String branch) {
        int count = 0;
        for (Employee1 emp : employees) {
            if (emp.getEmployeeBranch().equals(branch) && emp.isCompanyTransport()) {
                count++;
            }
        }
        return count;

    }

    public static Employee1 findEmployeeWithSecondHighestRating(Employee1[] employees) {
        if (employees.length < 2) {
            return null;
        }

        Employee1 highestEmployee = null;
        Employee1 secondHighestEmployee = null;

        for (Employee1 emp : employees) {
            if (!emp.isCompanyTransport()) {
                if (highestEmployee == null || emp.getEmployeeRating() > highestEmployee.getEmployeeRating()) {
                    secondHighestEmployee = highestEmployee;
                    highestEmployee = emp;
                } else if (secondHighestEmployee == null || emp.getEmployeeRating()> secondHighestEmployee.getEmployeeRating()) {
                    secondHighestEmployee = emp;
                }
            }
        }

        return secondHighestEmployee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the array size:");
        n = scanner.nextInt();
        Employee1[] employees = new Employee1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your employeeId:");
            int employeeId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your employee name:");
            String name = scanner.nextLine();
            System.out.println("Enter your branch name:");
            String branch = scanner.nextLine();
            System.out.println("Enter your rating");
            double rating = scanner.nextDouble();
            System.out.println("Are u using transport are not:");
            boolean companyTransport = scanner.nextBoolean();
            employees[i] = new Employee1(employeeId, name, branch, rating, companyTransport);
        }
        System.out.println("Enter the branch input:");
        String branchInput = scanner.next();

        int count = findCountOfEmployeesUsingCompTransport(employees, branchInput);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("no such employees are not used transport for this branch");
        }
        Employee1 secondHighestEmployee = findEmployeeWithSecondHighestRating(employees);
        if (secondHighestEmployee != null) {
            System.out.println(secondHighestEmployee.getEmployeeId());
            System.out.println(secondHighestEmployee.getEmployeeName());
        } else {
            System.out.println("All Employees using company transport");
        }

        scanner.close();
    }

}
