class ObjectOrientedProgramming
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Rohit";
		s1.age = 28;
		s1.rollNumber = 101;
		s1.college = "RD & DJ College";
		
		s2.name = "Sobu";
		s2.age = 27;
		s2.rollNumber = 102;
		s2.college = "RD & DJ College";
		
		s1.markAttendance();
		s2.print();
		
	}
}

class Student{
	String name; 
	int age; 
	int rollNumber;
	String college;
	
	void markAttendance(){
		System.out.println("Attendance marked by " +name);
	}
	
	void print(){
		System.out.println(name+" , "+age+" , "+rollNumber+" , "+college);
	}
}