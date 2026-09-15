class StudentResult
{
	static String name;
	static int marks;
	
	public static void main(String[] args)
	{
		name = "Kamdev";
		marks = 67;
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
		System.out.println("Passing marks = 40");
		display();
	}
	
	static void display(){
		int passingMarks = 40;
		if(StudentResult.marks>passingMarks){
			System.out.println("Result = Pass");
		}
		else{
			System.out.println("Result = Fail");
		}
	}
}
class Student1{
	public static void main(String[] arg)
	{
		System.out.println("Student 1");
	}
}
