package Day2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		int i,j,c=1;
		System.out.print("Enter the number of rows to print:");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		c=row-1;
		for(i=1;i<row;i++) {
			for(j=1;j<=c;j++) {
				System.out.print("");
			}
			c--;
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		c=1;
		for(i=1;i<row-1;i++) {
			for(j=1;j<=c;j++) {
				System.out.print("");
			}
			c++;
			for(j=1;j<=2*(row-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
