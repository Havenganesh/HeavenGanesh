package matrix;

import java.util.Scanner;

public class PassingArrayToMethod {

	public static void main(String[] args) 
	{
		int [][] array =new int[3][3];
		PassingArrayToMethod obj =new PassingArrayToMethod();
		int[][]m=obj.getarray(array);
		print1(m);
	}

	private int[][] getarray(int[][]m) 
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter " + m.length + " rows and "
				+ m[0].length + " columns: ");
				for (int i = 0; i < m.length; i++)
				for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextInt();
				input.close();
		
		return m;
	}
	public static void print1(int[][]m)
	{
		
		for (int row = 0; row < m.length; row++) 
		{
		for (int column = 0; column < m[row].length; column++) 
		{
		System.out.print(m[row][column]);
		}
		System.out.println();
	}
	}
}
