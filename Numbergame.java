package miniprojects;

import java.util.Scanner;

public class Numbergame {
	
	static int[] randomNumber = new int[4];
	static String[] answer =new String[4];
	static boolean[] bool =new boolean[4];
	
	public static void main(String[] args) 
	{
		Numbergame numberObj =new Numbergame();
		randomNumber();
		for(int i=0;i<4;i++)
		{
			System.out.print(randomNumber[i]);
		}
		System.out.println();
		Scanner input =new Scanner(System.in);
		do {
		int userInputNo = input.nextInt();
		numberObj.checkTheNums(userInputNo);
		}while(bool[0]!=true || bool[1]!=true || bool[2]!=true || bool[3]!=true);

	}
	public void checkTheNums(int userInput)
	{
		int iv=userInput%10;
		userInput=userInput/10;
		if(iv==randomNumber[3])
		{
			answer[3]="ok";
			bool[3]=true;
		}
		else if(iv==randomNumber[2]||iv==randomNumber[1]||iv==randomNumber[0])
		{
			answer[3]="semi";
			bool[3]=false;
		}
		else
		{
			answer[3]="Null";
			bool[3]=false;
		}
		int iii=userInput%10;
		userInput=userInput/10;
		if(iii==randomNumber[2])
		{
			answer[2]="ok";
			bool[2]=true;
		}
		else if(iii==randomNumber[3]||iii==randomNumber[1]||iii==randomNumber[0])
		{
			answer[2]="semi";
			bool[2]=false;
		}
		else
		{
			answer[2]="Null";
			bool[2]=false;
		}
		int ii=userInput%10;
		userInput=userInput/10;
		if(ii==randomNumber[1])
		{
			answer[1]="ok";
			bool[1]=true;
		}
		else if(ii==randomNumber[3]||ii==randomNumber[2]||ii==randomNumber[0])
		{
			answer[1]="semi";
			bool[1]=false;
		}
		else
		{
			answer[1]="Null";
			bool[1]=false;
		}
		int i=userInput%10;
		userInput=userInput/10;
		if(i==randomNumber[0])
		{
			answer[0]="ok";
			bool[0]=true;
		}
		else if(i==randomNumber[3]||i==randomNumber[2]||i==randomNumber[3])
		{
			answer[0]="semi";
			bool[0]=false;
		}
		else
		{
			answer[0]="Null";
			bool[0]=false;
		}
		System.out.println(i+" "+ii+" "+iii+" "+iv);
		for(int j=0;j<4;j++)
			System.out.print(answer[j]+" ");
		System.out.println();
		
	}

	private static void randomNumber() 
	{
		int I=(int)(Math.random()*8)+1;
		int II=0;
		int III=0;
		int IV=0;
		randomNumber[0]=I;
		do {
			II=(int)(Math.random()*8)+1;
		}while(I==II);
		randomNumber[1]=II;
		do {
			III=(int)(Math.random()*8)+1;
		}while(I==III||II==III);
		randomNumber[2]=III;
		do {
			IV=(int)(Math.random()*8)+1;
		}while(I==IV||II==IV||III==IV);
		randomNumber[3]=IV;	
	}

}
