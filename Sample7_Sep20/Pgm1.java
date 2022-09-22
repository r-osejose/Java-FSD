package Sample7_Sep20;

import java.util.Scanner;

public class Pgm1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter age: ");
		int Age = scan.nextInt();
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter gender (M/F): ");
		char Sex = scan1.next().charAt(0);
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter Martial status (Y/N): ");
		char Marital = scan2.next().charAt(0);
	
		if(Sex=='F') {
			System.out.println("Work in urban areas");
		}
		
		else if(Sex=='M') {
			
			if ((Age>20) && (Age<=40)) {
				System.out.println("Can work anywhere");
			}
			else if ((Age>40) && (Age<=60)) {
				System.out.println("Work in urban areas");
				}
			else {
				System.out.println("Error");
			}
			}
			
			else
			{
				System.out.println("Error");
			}
		}
	
}
