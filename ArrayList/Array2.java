package ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String> ();
		a.add("Rose");
		a.add("Jose");
		a.add("Rajagiri");
		a.add("UST");
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}