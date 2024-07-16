package day2Assessment;

public class Employee1 {
	 private int employeeId;
     private String employeeName;
     private String employeeBranch;
     private double employeeRating;
     public Employee1(int employeeId, String employeeName, String employeeBranch, double employeeRating,
			boolean companyTransport) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBranch = employeeBranch;
		this.employeeRating = employeeRating;
		this.companyTransport = companyTransport;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeBranch() {
		return employeeBranch;
	}
	public void setEmployeeBranch(String employeeBranch) {
		this.employeeBranch = employeeBranch;
	}
	public double getEmployeeRating() {
		return employeeRating;
	}
	public void setEmployeeRating(double employeeRating) {
		this.employeeRating = employeeRating;
	}
	public boolean isCompanyTransport() {
		return companyTransport;
	}
	public void setCompanyTransport(boolean companyTransport) {
		this.companyTransport = companyTransport;
	}
	public boolean companyTransport;
	
	public Employee1(){
		
	}

}
