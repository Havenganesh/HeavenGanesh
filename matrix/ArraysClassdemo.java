package matrix;
import java.util.Arrays;
public class ArraysClassdemo {

	public static void main(String[] args) 
	{
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers);
		for(double a:numbers)
			System.out.println(a);
		double[] numbers1 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		System.out.println("this is parallel sort");
		Arrays.parallelSort(numbers1);
		for(double a:numbers1)
			System.out.println(a);
		System.out.println("this is limited sort");
		double[] numbers2 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers2, 2, 6);
		for(double a:numbers2)
			System.out.println(a);
		System.out.println("this is  the binarysearch");
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.println(Arrays.binarySearch(numbers1, 6));
		System.out.println(Arrays.binarySearch(list, 70));
		
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		System.out.println(Arrays.equals(list1, list2));
		
		int[] list11 = {2, 4, 7, 10};
		int[] list22 = {2, 4, 7, 7, 7, 10};
		java.util.Arrays.fill(list11, 5); // Fill 5 to the whole array
		for(double a:list11)
			System.out.print(a+" ");
		System.out.println();
		java.util.Arrays.fill(list22, 3, 5, 8);
		for(double a:list22)
			System.out.print(a+" ");
		System.out.println();
		

	}

}
