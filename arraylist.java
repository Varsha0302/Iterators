
// Java code to illustrate iterator()

import java.util.*;

public class arraylist{

	public static void main(String[] args)
	{
		// Create and populate the list
		ArrayList<String> list
			= new ArrayList<>();

		list.add("Java");
		list.add("Python");
		list.add("Javascript");
		list.add("ReactJS");
		list.add("Angular");
		

		System.out.println("The list is: \n"
						+ list);

		Iterator<String> iter
			= list.iterator();

		
		System.out.println("\nThe iterator values"
						+ " of list are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		for (String s :list) {
			System.out.println(s);
		}
	}
}
