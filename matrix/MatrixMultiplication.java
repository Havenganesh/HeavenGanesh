package matrix;

public class MatrixMultiplication {

	static int[][] matrixA= {{2,2,2},
			                 {5,9,3},
			                 {8,7,1}};
	static int[][] matrixB= {{2,8,1},
			                 {2,4,1},
			                 {2,7,2}};
	static int[][] matrixresult= new int[3][3];
	
	public static void main(String[] args) 
	{
		MatrixMultiplication matrix=new MatrixMultiplication();
		matrix.multi();
	}
	private void multi() 
	{
		for(int row=0;row<matrixresult.length;row++)
		{
			for(int col=0;col<matrixresult[0].length;col++)
			{
				for(int value=0;value<matrixresult.length;value++)
				{
					int a=matrixA[row][value]*matrixB[value][col];
					matrixresult[row][col] +=a;
				}
			}
		}
		for(int row=0;row<matrixresult.length;row++)
		{
			for(int col=0;col<matrixresult[0].length;col++)
			{
				System.out.print(matrixresult[row][col]+" ");
			}
			System.out.println();
		}
	}
}