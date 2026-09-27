package Day10AccessModifier;
public class PrivateMain{

    public static void main(String[] args) {

        PrivateStudent s = new PrivateStudent();
		
		System.out.println("Main Start");
		
		// Accesing method 
		System.out.println("Calling method");
        System.out.println(s.getName());  // ✅

        s.setName("Aman");                // ✅

        System.out.println(s.getName());  // Aman
    }
}