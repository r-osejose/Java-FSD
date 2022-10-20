import java.util.*;
public class SwitchArth {

	public static void main(String[] args) {
		int sum,minus,multi,div;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter two number:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Arithmetic Operations");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice:");
		int s = scan.nextInt();

			switch(s)
		{
		case 1:
			sum=x+y;
			System.out.println("Addition: "+sum);
			break;
		case 2:
			minus=x-y;
			System.out.println("Substraction: "+minus);
			break;
		case 3:
			multi=x*y;
			System.out.println("Multiplication: "+multi);
			break;
		case 4:
		div=x/y;
			System.out.println("Division: "+div);
			break;
		default:
				System.out.println("Invalid");
		}

	}

}
