package oops;

public class Employee {
	
	String Name; // private members can be accessed within the class
	int EmployeeId;
	static String CompanyName = "Infosys";
	static int Salary = 1000; // if salary is same for all employees, use static so one memroy location is used for all employees and most of static members are private in nature

	public Employee() {
		
	}
	
	public Employee(String Name, int EmployeeId, int Salary) { // constructor should have the same name and no return value
		this.Name = Name; //this.name belongs to class and the Name after equals belongs to parameter
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
	}
	
	public Employee(String Name, int EmployeeId) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
	}
	
	public void PrintName() {
		System.out.println("Name of employee is : " +Name);
	}
	
	public static void PrintSalary() {
		System.out.println("Employee Salary is : " +Salary);
	}
	
	public static void ChangeCompanyName() {
		Employee.CompanyName = "Acsent";
		System.out.println("changed company name : " + CompanyName);
	}
}
