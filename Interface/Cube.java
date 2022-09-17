package Interface;
// Static
interface Area{
	void draw();
	static int cube(int x) {
		return x*x*x;
	}
}
	class shape implements Area{
		public void draw() {
			System.out.println("Rectangle");
		}
	}
	
public class Cube {

	public static void main(String[] args) {
		Area a = new shape();
		a.draw();
		System.out.println("Cube: "+Area.cube(5));
	}
}
