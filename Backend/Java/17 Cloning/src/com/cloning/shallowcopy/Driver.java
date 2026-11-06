//package com.cloning.shallowcopy;
//
//public class Driver {
//	
//	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Address address = new Address("15th Main","9th cross","Banglore");
//		
//		Employee emp1 = new Employee("Salman","kw123",address);
//		
//		Employee clonedEmp = (Employee) emp1.clone();
//		
//		emp1.address.city = "MGR";
//		
//		System.out.println(emp1.address.city);
//		System.out.println(clonedEmp.address.city);
//	}
//}


package com.cloning.shallowcopy;

public class Driver {
	Address address;
	Employee emp1;
	Employee clonedEmp;
	
	public void doSomthing() throws CloneNotSupportedException {
		address = new Address("15th Main","9th cross","Banglore");
		
		emp1 = new Employee("Salman","kw123",address);
		
		clonedEmp = (Employee) emp1.clone();
		
		emp1.address.city = "MGR";
		
		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
		
		emp1 = null ;
		clonedEmp = null;   // Garbage collection
	}
	
	public static void main(String arg[]) throws CloneNotSupportedException {
		Driver d = new Driver();
		d.doSomthing();
	}
}
