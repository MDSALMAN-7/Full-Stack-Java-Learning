package com.learning.constructors;

public class EmpDriver {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Salman",27000,"Java");
		Employee emp2 = new Employee(102,"Kamdev",27000,"Java");
		
//		emp1
		System.out.println("Emp Id : "+emp1.empId);
		System.out.println("Emp Name : "+emp1.empName);
		System.out.println("Salary : "+emp1.salary);
		System.out.println("Department : "+emp1.department);
		
//		emp1
		System.out.println("Emp Id : "+emp2.empId);
		System.out.println("Emp Name : "+emp2.empName);
		System.out.println("Salary : "+emp2.salary);
		System.out.println("Department : "+emp2.department);
	}
}
