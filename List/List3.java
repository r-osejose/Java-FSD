package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class List3 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
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