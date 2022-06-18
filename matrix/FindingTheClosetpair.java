package matrix;
import java.util.Scanner;
public class FindingTheClosetpair {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the number of the points");
		int numberOfPoints =sc.nextInt();
		double[][] points= new double[numberOfPoints][2];
		System.out.println("enter "+numberOfPoints+" points");
		for(int i=0;i<points.length;i++)
		{
			points[i][0]=sc.nextDouble();
			points[i][1]=sc.nextDouble();
		}
		int p1=0,p2=1;
		double shortdistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) 
			{
			double distance = distance(points[i][0], points[i][1],
			points[j][0], points[j][1]);
			
		if (shortdistance > distance) {
			p1 = i; // Update p1
			p2 = j; // Update p2
			shortdistance = distance; // Update shortestDistance
			}}}
		System.out.println("The closest two points are " +
				"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
				points[p2][0] + ", " + points[p2][1] + ")");
	}

	private static double distance(double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
