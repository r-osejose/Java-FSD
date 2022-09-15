package ArrayList;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Array3 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String> ();
		a.add("Rose");
		a.add("Kochi");
		a.add("Rajagiri");
		a.add("UST");
		a.add("Trivandrum");
		Iterator itr = a.listIterator(2);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}