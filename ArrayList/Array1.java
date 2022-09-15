package ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String> ();
		a.add("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
		a.add("Trivandrum");
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}