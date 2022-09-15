package Day3;
class Printnumber{
	public void printn(int p) {
		System.out.println(p);
	}
	public void printn(double p) {
		System.out.println(p);
	}
}

public class pggm4 {

	public static void main(String[] args) {
		Printnumber pn=new Printnumber();
		pn.printn(1);
		pn.printn(2.5);
	}

}
