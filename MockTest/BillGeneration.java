package MockTest;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		int price,x,y,z;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of pizza bought:");
		int pizza = scan.nextInt();
		System.out.println("Enter the no of puffs bought:");
		int puffs = scan.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		int cooldrinks = scan.nextInt();
		System.out.println();
		System.out.println("Bill Details");
		System.out.println("No of pizza: "+pizza);
		System.out.println("No of puffs: "+puffs);
		System.out.println("No of cold drinks: "+cooldrinks);
		x= pizza*100;
		y=puffs*20;
		z=cooldrinks*10;
		price=x+y+z;
		System.out.println("Total Price: "+price);
		System.out.println("ENJOY THE SHOW!!");
	}

}
