package HACKATHON1;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		System.out.println("** FIBONACCI SERIES ** ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int num = scan.nextInt();
		System.out.println("The numbers are: ");
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
