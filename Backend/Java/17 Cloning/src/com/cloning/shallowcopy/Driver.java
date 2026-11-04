package com.cloning.shallowcopy;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("15th Main","9th cross","Banglore");
		
		Employee emp1 = new Employee("Salman","kw123",address);
		
		Employee clonedEmp = (Employee) emp1.clone();
		
		emp1.address.city = "MGR";
		
		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
	}
}
