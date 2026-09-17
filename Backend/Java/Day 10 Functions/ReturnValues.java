/* public class ReturnValues {
	public static void main(String[] args) {
		System.out.println("My number is "+myMethod(3));
	}
	
	static int myMethod(int x) {
		return x+4;
	}
} */


public class ReturnValues{
  // Method that doubles the number
  static int doubleGame(int x) {
    return x * 2;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Double of " + i + " is " + doubleGame(i));
    }
  }
}