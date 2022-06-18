package staticMembers;

public class TestCircle {

	public static void main(String[] args) 
	{
		CircleWithStaticMembers tc = new CircleWithStaticMembers(6);
		System.out.println(CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers.getNumberOfObjects();
		System.out.println(tc.getarea());

	}

}
