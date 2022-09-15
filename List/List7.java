package List;

import java.util.Iterator;
import java.util.LinkedList;

public class List7 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.addFirst("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
		a.add(0,"Hi...!!");
		Iterator itr = a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}