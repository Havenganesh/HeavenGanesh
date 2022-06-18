package staticMembers;

public class CircleWithStaticMembers {

	static int numberOfObjects;
	double radius;
	CircleWithStaticMembers()
	{
		radius=1;
		numberOfObjects++;
	}
	CircleWithStaticMembers(double radius)
	{
		this.radius=radius;
		numberOfObjects++;
	}
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	double getarea()
	{
		double area=this.radius*this.radius*3.1415265;
		return area;
	}

}
