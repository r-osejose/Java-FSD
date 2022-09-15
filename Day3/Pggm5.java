package Day3;

class charint{
	void intchar(int n, char m) {
		System.out.println(n+"is integer and"+m+"is character");
	}
	void intchar(char n, int m) {
		System.out.println(n+"is character and " +m+ "is integer");
	}
}
public class Pggm5 {

	public static void main(String[] args) {
		charint c = new charint();
		c.intchar(12,'T');
		c.intchar('H',56);
	}

}
