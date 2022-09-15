package Day3;

class XY{
	int i;
	void printNum() {
		System.out.println("i = " + i);
	}
}

class yz extends XY{
	int j;
	void printNum() {
			System.out.println("j = "+j);
		}
	}

public class pggm9 {

	public static void main(String[] args) {
		yz c = new yz();
		c.i = 10;
		c.j = 15;
		c.j = c.i;
		c.printNum();
	}

}
