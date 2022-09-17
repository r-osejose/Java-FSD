package Interface;

interface Shapes{
	void Draw();
}

class Rectangle implements Shapes{
	public void Draw() {
		System.out.println("Rectangle");
	}
}

class Circle implements Shapes{
	public void Draw() {
		System.out.println("Circle");
	}
}

public class Drawable {

	public static void main(String[] args) {
		Shapes  s= new Circle();
		s.Draw();
	}

}
