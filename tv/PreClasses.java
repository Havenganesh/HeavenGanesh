package tv;

import java.util.Date;
import java.util.Random;


public class PreClasses {

	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date.getTime());
		Random random =new Random(1);
		for(int i=0;i<30;i++)
		System.out.print(random.nextInt()+" ");
		

	}

}
