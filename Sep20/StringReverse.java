package Sep20;

import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		String original, Reverse="";
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a string to reverse: ");
		original = in.nextLine();
		
		int length = original.length();
		
		for(int i=length-1;i>=0;i--) {
			Reverse = Reverse + original.charAt(i);
		}
		System.out.println("Reversed String:");
		System.out.println(Reverse);
	}
}
