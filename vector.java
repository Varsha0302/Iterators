
import java.util.Enumeration;


import java.util.Vector;

public class vector {

	
	public static void main(String a[])
	{
		
		Vector<String> v = new Vector<String>();

		
		v.add("Welcome");
		v.add("To");
		v.add("Geeks for");
		v.add("Geeks");

		
		Enumeration<String> en = v.elements();

		while (en.hasMoreElements()) {

			
			System.out.println(en.nextElement());
		}
		for (String s :v) {
			System.out.println(s);
		}
	}
}
