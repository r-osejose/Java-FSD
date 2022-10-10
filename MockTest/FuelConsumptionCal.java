package MockTest;
import java.util.*;

import java.util.Scanner;

public class FuelConsumptionCal {
	
	public static void main(String[] args) {
		double Liters,GallonQuan,GallonDist,Miles;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank:");
		double Quantity = scan.nextDouble();
		if(Quantity<=0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}	
		System.out.println("Enter the no of liters to fill the tank:");
		double Distance = scan.nextDouble();
		if(Distance<=0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}			
		else {
		
		Liters = (Quantity/Distance)*100;
		System.out.println("Liters/100Km ");
		System.out.printf("%.2f",Liters);
		System.out.println();
		GallonQuan = Quantity*0.2642;
		GallonDist = Distance*0.62114;
		Miles = GallonDist/GallonQuan;
		System.out.println("Miles/gallons:");
		System.out.printf("%.2f",Miles);
		}}
}
