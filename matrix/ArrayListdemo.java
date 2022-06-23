package matrix;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add("hello");
		al.add("hello");
		al.add("i am amazing");
		al.add("parotta");
		al1.add("al");
		al.add(145);
		al.add(536);
		al.add(2,"body");
		al1.add("night");
		al1.add("night1");
		al1.add("night2");
		al1.add("night3");
		al1.add("night4");
		al1.add("night");
		al1.add("night");
		al1.add(5, al);
		al.ensureCapacity(20);
		System.out.println(al.size());
		System.out.println(al1.contains("night"));
		System.out.println(al);
		System.out.println(al1);
		al.forEach(name -> System.out.println(al) );
	}

}
