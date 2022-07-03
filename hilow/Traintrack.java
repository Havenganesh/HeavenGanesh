package hilow;

public class Traintrack {

	public static void main(String[] args) 
	{
		float []trainTime= {9.00f, 9.40f, 9.50f, 11.00f, 15.00f, 18.00f};
		float []trainDept= {9.10f, 12.00f, 11.20f, 11.30f, 19.00f, 20.00f};
		float []tracks=new float[6];
		
		for(int i=0;i<trainTime.length;i++)
		{
			float a = trainTime[i];
			if(i==0)
			tracks[i]=a;
			
		}
		
		
	}

}
