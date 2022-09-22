package Sample7_Sep20;

import java.util.Scanner;

//Leap Year
public class Pgm2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int Year = scan.nextInt();
		
		if((Year%4==0)&&(Year%100!=0)) {
			System.out.println(Year+" is a leap year");
		}
		else if(Year%400==0) {
			System.out.println(Year+" is a leap year");
		}
		else {
			System.out.println(Year+" is not a leap year");
		}
	}

}
