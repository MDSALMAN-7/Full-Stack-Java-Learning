/* 1. Student Information

Create a Student class with:
name
age
marks

Requirements:
Make all variables private.
Create a constructor to initialize all three variables.
Create a public method displayDetails().

Expected output:
Name: Rahul
Age: 21
Marks: 78
Focus: private + constructor + method. */

class StudentInformation
{
	public static void main(String args[])
	{
		Student st = new Student("Kamdev",24,9);
		st.displayDetails();
	}
	
}