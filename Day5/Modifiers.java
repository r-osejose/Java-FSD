package Day5;
 
class parentclass{
	int a=100;
	public int b=200;
	protected int c=300;
	private int d=400;
	
	void showData(){
		System.out.println("Inside Parent Class.........");
		System.out.println("");
		System.out.println("a = "+a);
		System.out.println("b = " +b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}

class ChildClass extends parentclass{
	void showData() {
		System.out.println("Inside Child Class......");
		System.out.println();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		//System.out.println("d = "+d);
	}
}
public class Modifiers {

	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.showData();
		c.showData();
	}

}
