package Day6;

public class NumberFormatExec {
       private static String input="12.33";
	public static void main(String[] args) {
		try {
			int ab= Integer.parseInt(input);
		}
		catch(NumberFormatException ex) {
			System.out.println("Invalid string");
		}
	}

}
