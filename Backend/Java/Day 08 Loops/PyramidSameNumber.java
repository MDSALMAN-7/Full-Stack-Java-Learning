

/*  1
	22
	333
	4444
	5555 */

public class PyramidSameNumber
{
	public static void main(String[] arg)
	{
		int num = 1;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num);
			}
			num++;
			System.out.println();
		}

	}
}