package Day3;

class A{
	public static void par() {
		System.out.println("Parents !");
	}
}

class B extends A {
	public static void par() {
		System.out.println("Child !");
	}
}

public class pggm10 {

	public static void main(String[] args) {
		A a = new A();
		a.par();
		B b = new B();
		b.par();
		A obj = new B();
		obj.par();
	}

}
