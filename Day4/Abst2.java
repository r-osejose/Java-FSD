package Day4;

abstract class Animals {
	abstract void cats();
	abstract void dogs();
}

class cats extends Animals{
	void cats() {
		System.out.println("Cats meow");
	}}
class dogs extends Animals{
	void dogs() {
		System.out.println("Dogs Bark");
	}
}


public class Abst2 {

	public static void main(String[] args) {
		cats s1 = new cats();
		dogs s2 = new dogs();
		s1.cats();
		s2.dogs();
	}

}
