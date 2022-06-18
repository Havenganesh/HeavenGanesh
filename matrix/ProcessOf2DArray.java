package matrix;
import java.util.Scanner;

public class ProcessOf2DArray {

	public static void main(String[] args) 
	{
		ProcessOf2DArray obj =new ProcessOf2DArray();
		obj.input();
		obj.userinput();
		
		

	}

	private void userinput() 
	{
		int[][] matrix=new int[5][5];
		Scanner input =new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " +
				matrix[0].length + " columns: ");
				for (int row = 0; row < matrix.length; row++) 
				{
				for (int column = 0; column < matrix[row].length; column++) 
				{
				matrix[row][column] =input.nextInt();
				}
				}
				for (int row = 0; row < matrix.length; row++) 
				{
				for (int column = 0; column < matrix[row].length; column++) 
				{
				System.out.print(matrix[row][column]+" ");
				}
				System.out.println();
				}
				input.close();

		
		
	}

	private void input() 
	{
		int[][] matrix=new int[5][5];
		System.out.println("Enter " + matrix.length + " rows and " +
				matrix[0].length + " columns: ");
				for (int row = 0; row < matrix.length; row++) 
				{
				for (int column = 0; column < matrix[row].length; column++) 
				{
				matrix[row][column] =((int)(Math.random()*9));
				}
				}
				for (int row = 0; row < matrix.length; row++) 
				{
				for (int column = 0; column < matrix[row].length; column++) 
				{
				System.out.print(matrix[row][column]+" ");
				}
				System.out.println();
				}
		
	}

}
