package Java8;

import java.util.ArrayList;
import java.util.List;

public class NumberOfString {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("Rose");
		list.add("Sona");
		list.add("Rusafid");
		list.add("Trivandrum");
		list.add("Rajagiri");
		list.add("UST");
		
		long count = list.stream().filter(str -> str.length()>5).count();
		System.out.println("We have "+count+" string with length greater than 5");
	}
	
}
