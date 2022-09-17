package Interface;

interface Money{
	float rateOfInterest();
}

class SBI implements Money{
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Money{
	public float rateOfInterest() {
		return 9.17f;
			}
}

public class Bank {

	public static void main(String[] args) {
		Money m= new SBI();
		System.out.println("ROI: "+m.rateOfInterest());
	}

}
