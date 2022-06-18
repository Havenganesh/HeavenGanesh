package matrix;

public class ArrayReturn {

	public static void main(String[] args) 
	{
		ArrayReturn ar =new ArrayReturn();
		int[]array1= {2,6,4,8,9,7,10};
		int[] a=ar.reverse(array1);
		for(int b:a)
		{
		System.out.print(b+" ");	
		}

	}

	public int[] reverse(int[] a) 
	{ 
		int[] result=new int[a.length];
		for(int i=0,j=result.length-1;i<a.length;i++,j--)
		{
			result[j]=a[i];
		}
		
		return result;
	}

}
