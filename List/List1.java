package List;

import java.util.Iterator;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.add("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
		a.addLast("Trivandrum");
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}