package interviewQuestions;

public class Pattern {

	public static void main(String[] args) 
	{
		Pattern patrn = new Pattern();
//		patrn.pyramid();
//		System.out.println();
//		patrn.revpyramid();
//		System.out.println();
		patrn.diamond();
		System.out.println();
		patrn.integrReverse();
		System.out.println();
		patrn.palindrome();
		

	}
	private void palindrome() 
	{
		int N =0;
		int num=10012;
		int palindrome_Num=num;
		while(num>0)
		{
			N=(N*10)+(num%10);
			num=num/10;
		}
		if(palindrome_Num==N)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		
	}
	private void integrReverse() 
	{
		int N =0;
		int num=65528998;
		while(num>0)
		{
			N=(N*10)+(num%10);
			num=num/10;
		}
		System.out.println(N);
		
	}
	private void diamond() 
	{
		int number=1;
		for(int row=1;row<=9;row++)
		{
			for(int space=(row<=5?6-row:row-4);space>=1;space--)
				System.out.print("  ");
			for(int num=1;num<=number;num++)
				System.out.print(num+" ");
			if(row<=4)
				number=number+2;
			else
				number=number-2;
			System.out.println();
		}
		
	}
	private void revpyramid() 
	{
		for(int row=5;row>=1;row--)
		{
			for(int space=6-row;space>=1;space--)
				System.out.print("  ");
			for(int num=1;num<=row;num++)
				System.out.print(num+" ");
			for(int revnum=row-1;revnum>=1;revnum--)
				System.out.print(revnum+" ");
			System.out.println();
		}
		
	}
	public void pyramid()
	{
		for(int i=0;i<=5;i++)
		{
			for(int star=5;star>=i;star--)
				System.out.print("  ");
			for(int num=1;num<=i;num++)
				System.out.print(num+" ");
			for(int rev=i-1;rev>=1;rev--)
				System.out.print(rev+" ");
			System.out.println();
		}
		
	}

}
