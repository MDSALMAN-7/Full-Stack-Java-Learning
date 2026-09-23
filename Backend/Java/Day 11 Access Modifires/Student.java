public class Student
{
	private String name;
	private int age;
	private int marks;
	
	Student(String _name, int _age, int _marks){
		this.name = _name;
		this.age = _age;
		this.marks = _marks;
	}
	public void displayDetails(){
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
	}
	
}