package interviewQuestions;

import java.util.Scanner;

public class arrrayInterview {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter the length of array");
		int count=sc.nextInt();
		int[] array1 = new int[count];
		boolean result=true;
		for(int i=0;i<count;i++)
		{
			System.out.println("please enter the number");
			array1[i]=sc.nextInt();	
		}
		for(int i=0;i<count&&result;i++)
		{
			if(array1[i]>0&&array1[i]<=count)
			{
				for(int j=i+1;j<count;j++)
				{
					if(array1[i]==array1[j])
						result=false;
						
				}
			}
			else
				result=false;
		}
		if(result)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		

	}

}
