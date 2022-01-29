package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		emp1.Name = "Jagan";
		emp1.EmployeeId = 52645;
		emp1.Salary = 5000;
		
		Employee emp2 = new Employee();
		emp2.Name = "Suresh";
		emp2.EmployeeId = 15231;
		emp2.Salary = 10000;
		
		//System.out.println("Employee 1 name : " +emp1.Name);
		//System.out.println("Employee 2 name : " +emp2.Name);
		*/
		/*
		
		
		Employee emp1 = new Employee("Jagan",52645,5000);
		Employee emp2 = new Employee("Suresh",15231,10000);
			
		emp1.PrintName();
		emp2.PrintName();
		*/
		
		Employee emp4 = new Employee();
		
		Employee emp3 = new Employee("Mahesh",45217);
		emp3.PrintName();
		Employee.PrintSalary(); // static members can be accessed by class name as they are class members
		Employee.ChangeCompanyName(); //static functions can be accessed by class name as they are class functions
		
		Employee emp5 = new Employee();
		
		Person per1 = new Person();
		
		ChildClass child = new ChildClass();
		
		ChildClass child1 = new ChildClass("Rahul",35,"Actor");
		
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6, 7);
		
		//BankExample bank = new BankExample(); will not allow to create object of abstract class
		
		EncapsulationExample obj1 = new EncapsulationExample();
		obj1.setName("Rohit");
		System.out.println(obj1.getName());
		
	}

}
