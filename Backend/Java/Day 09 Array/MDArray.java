// Multi Dimensional array --> each woth diff length

public class MDArray
{
	public static void main(String[] args)
	{
		int [][] marks = new int[3][];
		
		marks[0]  = new int[1];
		marks[1]  = new int[2];
		marks[2]  = new int[3];
		
		marks[0][0] = 23;
		
		marks[1][0] = 24;
		marks[1][1] = 25;
		
		marks[2][0] = 26;
		marks[2][1] = 27;
		marks[2][2] = 28;
		
		for(int row = 0; row<marks.length; row++){
			for(int col = 0; col<marks[row].length; col++){
				System.out.print(marks[row][col] + " ");
			}
			System.out.println();
		}
		
	}
}