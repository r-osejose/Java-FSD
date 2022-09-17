package Interface;

interface Print{
	void print();
}
interface Show extends Print{
	void show();
}
 
public class HelloWorld implements Show{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.print();
		obj.show();
}}
