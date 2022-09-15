package Day6;

public class ExecString {

	public static void main(java.lang.String[] args) {
		try {
			String s ="Hello";
			char c=s.charAt(6);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("OutBound");
		}
		finally {
			System.out.println("Print Anyways");
		}
	}
}
