/* 
* * *
  *
  *


public class PerpendicularPattern{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if(i==1){
					System.out.print("* ");
				}
				else if(i==2 && j==2){
					System.out.print("* ");
				}
				else if(i==3 && j==3){
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
} */

public class PerpendicularPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (i == 1) {
                    System.out.print("* ");
                }
                else if (j == 3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}