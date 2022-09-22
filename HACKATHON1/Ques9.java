package HACKATHON1;

import HACKATHON1.Parent;
import HACKATHON1.Sub1;
import HACKATHON1.Sub2;

abstract class Parent{
	abstract void message();
}

class Sub1 extends Parent{
	public void message() {
		System.out.println("This is first subclass");
	}
}

class Sub2 extends Parent{
	public void message() {
		System.out.println("This is second subclass");
	}
}

public class Ques9 {
	public static void main(String[] args) {
		System.out.println("ABSTRACT CLASS");
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2();
		s1.message();
		s2.message();

	}

}
