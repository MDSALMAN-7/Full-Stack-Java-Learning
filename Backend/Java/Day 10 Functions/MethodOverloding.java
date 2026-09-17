public class MethodOverloding {
  static int plusMethodInt(int x, int y) {
    return x + y;
  }
  
  static int plusMethodInt(int x, int y, int z) {
    return x + y+z;
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethodInt(8, 5);
    int myNum2 = plusMethodInt(4,3, 6);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
