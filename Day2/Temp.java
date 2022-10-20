import java.util.*;
public class Temp {

	public static void main(String[] args) {
		float F,C;
		Scanner scan = new Scanner (System.in);	
		System.out.println("Temperature Conversion");
		System.out.println("1.Celcius to Fahrenhiet\n2.Fahrenhiet to Celcius");
		System.out.println("Enter your choice:");
		int s = scan.nextInt();
			System.out.println("Enter temperature:");
		float x = scan.nextFloat();
			switch(s)
		{
		case 1:
			F=(x*9/5)+32;
			System.out.println("Celcius to Fahrenhiet: "+F);
			break;
		case 2:
			C=(x-32)*5/9;
			System.out.println("Fahrenhiet to Celcius: "+C);
			break;
		default:
				System.out.println("Invalid");
		}

	}

}
