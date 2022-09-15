package Day4;

import java.util.Scanner;

public class p4gm3 {

	public static void main(String[] args) {
		int n,s=0,p=1;
		int a[] = new int[20];
		System.out.println("Number of integers needed:");
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		System.out.print("Enter "+n+" integers : ");
		for(int i=0;i<n;i++) {
			Scanner sca = new Scanner(System.in);
			 a[i] = scan.nextInt();
		}
	for(int j=0;j<n;j++) {
		s=s+a[j];
		p=p*a[j];
	}
		System.out.println("Sum : "+s);
		System.out.println("Product : "+p);
	}}