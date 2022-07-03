package matrix;

import java.util.Scanner;

public class LuhnAlgorithm {
	static int[] debitnum;
	public static void main(String[] args) 
	{
		System.out.println("please enter debit Num");
		Scanner input = new Scanner(System.in);
		for(int j=0;j<5;j++) {
		String debitNum =input.next();
		debitnum=new int[debitNum.length()];
		LuhnAlgorithm run =new LuhnAlgorithm();
		run.luhn(debitNum);}
		

	}

	private void luhn(String debitNum) 
	{
		for(int i=0;i<debitNum.length();i++)
		{
			debitnum[i]=debitNum.charAt(i)-'0';
		}
		for(int i=debitnum.length-2;i>=0;i=i-2)
		{
			int a=debitnum[i]*2;
			if(a>9)
			{
				int b=a%10;
				a=a/10;
				a=a+b;
			}
			debitnum[i]=a;
		}
		int total=0;
		for(int j=0;j<debitnum.length;j++)
		{
			total=total+debitnum[j];
		}
//		System.out.println(total);
		if(total%10==0)
		{
			System.out.println("verified successfully. your card was authorized");
		}
		else
		{
			System.out.println("please enter a valid debit number");
		}
	}


	

}
