package com.accessmodifier.protectedExample;

import com.accessmodifier.protectedExample.client.Manager;

//public class EmployeeDriver {
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		
//		emp.display();
//	}
//}

public class EmployeeDriver{
	public static void main(String[] args) {
		Employee e = new Employee("Salman");
		Manager m = new Manager("Salman");
		e.sayHello();
		m.sayHello();
	}
}
