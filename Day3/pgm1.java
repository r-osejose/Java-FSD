package Day3;

	class  parent {
		void method() {
		System.out.println("This is parent class");
			}
	}
	
	class Child extends parent{
		void method() 
{				System.out.println("This is child class");
			super.method();
		}
	}

public class pgm1 {

	public static void main(String[] args) {
		parent p=new parent();
		Child c=new Child();
		p.method();
		c.method();
	}

}
