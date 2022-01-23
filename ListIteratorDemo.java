

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args)
	{
		List<String> names = new LinkedList<>();
		names.add("Java");
		names.add("Angular");
		names.add("ReactJS");
		names.add("Javascript");
		names.add("Python");

		
		ListIterator<String> namesIterator
			= names.listIterator();

	
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		for (String s : names) {
			System.out.println(s);
		}
	}
}
