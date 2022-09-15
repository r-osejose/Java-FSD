package Day3;

class Shape{
	public void show()
	{
		System.out.println("This is shape");
	}
}

class rectangle extends Shape{
	public void display()
	{
		System.out.println("Rectangle");
	}
}
class Circle extends Shape{
	public void display()
	{
		System.out.println("Circle");
	}
}

class square extends rectangle{
	public void display()
	{
		System.out.println("Square");
	}
}

public class pggm3 {

	public static void main(String[] args) {
		square sq = new square();
		sq.show();
		sq.display();
	}
}
