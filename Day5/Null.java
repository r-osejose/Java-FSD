package Day5;

public class Null {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.print("First element : "+s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception occurs.");
		}
	}

}
