
import java.io.*;
import java.util.Scanner;
public class SatPix
{

	public static void main(String[] args) throws IOException
	{
		boolean[][] booleanArr = fileToBoolArray("satpix.in");
		int sizeOfLargestPasture=0;
		int size = 0;
		for (int i = 0; i < booleanArr.length; i++)
		{
			for (int p = 0; p < booleanArr [0].length; p++)
			{
				size = recursivelyMeasureAndMarkPasture(i,p,booleanArr);
				if (size > sizeOfLargestPasture)
				{
					sizeOfLargestPasture = size;
				}
			}
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		out.println(sizeOfLargestPasture);
		out.close();
	}

	private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
	{
		Scanner scan = new Scanner (new File ("satpix.in"));
		int row = scan.nextInt();
		int col = scan.nextInt();
		String line = "";
		boolean[][] arr = new boolean[row][col];
		for (int i = 0; i < arr.length; i++)
		{
			line = scan.next();
			for (int p = 0; p < arr[0].length; p++)
			{
				arr[i][p]= (line.charAt(p)=='*');		
			}
		}
		return arr;
	}

	private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
	{
		int size=0;
		if (row >= 0
				&& col >= 0
				&& row < arr.length
				&& col < arr[0].length
				&& arr[row][col])
		{
			arr[row][col] = false;
			size++;
			recursivelyMeasureAndMarkPasture( row - 1, col, arr);
			recursivelyMeasureAndMarkPasture( row + 1, col, arr);
			recursivelyMeasureAndMarkPasture( row, col + 1, arr);
			recursivelyMeasureAndMarkPasture( row, col - 1, arr);
		}
		return size;
	}
}
