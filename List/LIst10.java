package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LIst10 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.addFirst("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
			System.out.println("First occured element: "+ a.getFirst());
			System.out.println("Last occured element: "+ a.getLast());

		}
	}

