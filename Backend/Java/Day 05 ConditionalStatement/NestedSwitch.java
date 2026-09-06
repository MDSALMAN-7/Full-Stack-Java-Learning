public class NestedSwitch
{
	public static void main(String[] args)
	{
		int j = 5;
		int k = 2;
		
		switch(j){
			case 4:
				System.out.println(" j is 4");
				break;
			case 5:
				switch(k){
					case 1:
						System.out.println("K is 1");
						break;
					case 2:
						System.out.println("K is 2");
						break;
				}
				break;
			default:
				System.out.println("j is not 4 & 5");
				break;
		}
	}
}