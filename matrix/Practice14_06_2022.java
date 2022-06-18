package matrix;

public class Practice14_06_2022 {
	static boolean result;

	public static void main(String[] args) 
	{
		Practice14_06_2022 pr =new Practice14_06_2022();
		pr.practice1();
		
		
	}

	private void practice1() {
		
		String input1="abcd";
		String input2="dcba";
		int a=input2.length()-1;
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)==input2.charAt(a))
				result=true;
			else
				result=false;
			if(result==false)
				break;
			a--;
		}
		System.out.println(result);

		
	}

}
