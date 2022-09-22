package Sample_Sep21;

import java.util.Scanner;

public class ArmstrongNum {
	
	static boolean  isArmstrong(int n) {
		int temp, digit=0,sum=0,last=0;
		temp = n;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+= Math.pow(last,digit);
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		if(isArmstrong(n)) {
			System.out.println(n+" is Armstrong number");
		}
		else {
			System.out.println(n+" is not Armstrong number");
		}
	}

}
