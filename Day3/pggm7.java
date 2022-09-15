package Day3;

class Degree{
	void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree{
	void getDegree() {
		System.out.println("I am an undergraduate");
	}
}

class Postgraduate extends Degree{
	void getDegree() {
		System.out.println("I am a postgraduate");
	}
}
public class pggm7 {

	public static void main(String[] args) {
		Undergraduate u = new Undergraduate();
		Postgraduate p = new Postgraduate();
		Degree d = new Degree();
		d.getDegree();
		u.getDegree();
		p.getDegree();
	}


}
