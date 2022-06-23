package matrix;
import java.util.Scanner;
public class Numteller {
	
		static String and=" and ";

		public static void main(String[] args) 
		{
			Numteller nt =new Numteller();
			nt.valueTeller();
			
			
		}
		public void valueTeller()

		{
			Scanner sc =new Scanner(System.in);
			System.out.println("please enter a value into 999");
			int value=sc.nextInt();
			
			String[] textvalues= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen"
					,"Sixteen","Seventeen","Eighteen","Nineteen",};
			String[] tenthPosition= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred"};
			String thounsand="Thousand";
			if(value==0)
				System.out.println("Zero");
			
			if(value<20)
				System.out.println(textvalues[value]);
			
			if(value%10==0&&value<101)
			{
				int j=value/10;
				System.out.println(tenthPosition[j]);
			}
			
			if(value>20&&value%10!=0&&value<111)
			{
				int j =value%10;
				value =value/10;
				String number=tenthPosition[value]+" "+textvalues[j];
				System.out.println(number);
			}
			
			if(value>20&& (value%100>9 && value%100<20))//10-19
			{
				int j=value%100;
				value=value/100;
				System.out.println(textvalues[value]+" Hundred and "+textvalues[j]);
			}
			if(value%100==0)
			{and=" ";}
			
			if(value>119&&(value%100>=20 || value%100<10))
			{   
			
				int j =value%10;//421 1
				value = value/10;//42
				int k =value%10;//42 2
				value= value/10;//4
				System.out.println(textvalues[value]+" "+tenthPosition[10]+and+tenthPosition[k]+" "+textvalues[j]);
			}
			if(value>119&&(value%100>=20 || value%100<10))
			{   
				int j =value%10;//5421 1
				value = value/10;//542
				int k =value%10;//542 2
				value= value/10;//54
				int t =value%10;//4
				value= value/10;
				System.out.println(textvalues[value]+" "+tenthPosition[10]+and+tenthPosition[k]+" "+textvalues[j]);
			}
			sc.close();
		}

	}


