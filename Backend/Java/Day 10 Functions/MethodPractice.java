public class MethodPractice {
 // single parameter
  static void myMethod(String fname) { // when a paramethod is passed in method , it is called argument
    System.out.println(fname + "Bihari");
  }

	// multiple parameter 
	static void multipleParameter(String fname, int age){
		System.out.println(fname +" "+age);
	}
	
	
	public static void main(String[] args) {
		myMethod("Kamdev"); // this is argument 
		myMethod("sonu");
		myMethod("vivek");
		multipleParameter("Kamdev",23);
	}
}