
public class SatPix
{
	import java.io.*;
import java.util.Scanner;

	public static void main(String[] args) throws IOException
	{
		boolean[][] booleanArr = fileToBoolArray("satpix.in");
		int sizeOfLargestPasture;
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		out.println(sizeOfLargestPasture);
		out.close();
	}

			private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
			{
				Scanner scan = new Scanner (new File ("satpix.in"));
				int row = scan.nextInt();
				int col = scan.nextInt();
				boolean[][] arr = new boolean[row][col];
				for (int i = 0; i < arr.length; i++)
				{
					for (int p = 0; p < arr[0].length; p++)
					{
						if (Scan.nextChar().equals (""))
					}
			}

	private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
	{
		//This recursive method employs the flood-fill algorithm to
		//count the size of a single pasture and "mark" it so it is not double-counted
		return 0;
	}

}
}
