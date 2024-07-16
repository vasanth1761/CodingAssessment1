package day2Assessment;

import java.util.ArrayList;
import java.util.List;







public class Company {
	private String companyName;
	private Employee[] employeeName;
	private int numEmployees;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee[] getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(Employee[] employeeName) {
		this.employeeName = employeeName;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public Company(String companyName, Employee[] employeeName, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employeeName = employeeName;
		this.numEmployees = numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
  public Company()
  {
  }
  public double getAverageSalary() 
  {
      double totalSalary = 0;
      for (Employee emp : employeeName) 
      {
          totalSalary += emp.getSalary();
      }
      double averageSalary=totalSalary / numEmployees;
      return averageSalary;
  }
  public double getMaxSalary() 
  {
      double maximumSalary = 0;
      for (Employee emp : employeeName)
      {
          if (emp.getSalary() > maximumSalary) 
          {
              maximumSalary = emp.getSalary();
          }
      }
      return maximumSalary;
  }
   public List<Employee> getEmployeesByDesignation(String designation) {
      List<Employee> result = new ArrayList<>();
      for (Employee user : employeeName) {
          if (user.getDesignation().equalsIgnoreCase(designation)) {
              result.add(user);
          }
      }
      return result;
  }
  
  }

