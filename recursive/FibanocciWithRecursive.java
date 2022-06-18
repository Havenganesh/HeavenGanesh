package recursive;

public class FibanocciWithRecursive {

	public static void main(String[] args) 
	{
		FibanocciWithRecursive Fiba = new FibanocciWithRecursive();
		Fiba.fibanocci(0,0);
	}
	private void fibanocci(int a,int b) 
	{
		if(a==0)
			a=1;
		else {
		b=a+b;
		a=b-a;}
		System.out.println(b);
		if(a<100)
			fibanocci(a,b);
		
	}

}
