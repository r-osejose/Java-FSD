package Day6;

public class Null1 {

	public static void main(String[] args) {
		String a = null;
		try {
			System.out.print("First element : "+a.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception occurs.");
		}
	}

}
