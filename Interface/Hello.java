package Interface;

 interface Printable{
	 void print();
 }

 interface Showable{
	 void print();
 }
 
public class Hello implements Printable,Showable {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.print();
	}

}
