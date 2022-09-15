package List;

import java.util.Iterator;
import java.util.LinkedList;

public class List9 {

	public static void main(String[] args) {
		LinkedList <String> a = new LinkedList<String> ();
		a.addFirst("Rose");
		a.add("Rajagiri");
		a.add("UST");
		a.add(0,"Hello...!!");
		a.add(3,"Kochi");
		a.add(5,"Have a nice day :)");
		Iterator itr = a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}