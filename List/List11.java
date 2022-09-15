package List;

import java.util.Iterator;
import java.util.LinkedList;

public class List11{

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.addFirst("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
		a.remove("Jose");
		Iterator itr = a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}