package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class List4 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.add("Rose");
		a.add("Rajagiri");
		a.add("UST");
		a.add("Trivandrum");
		Collections.reverse(a);
		Iterator itr = a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}