package Day2;

	import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		int evensum=0, oddsum=0;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evensum = evensum+rem;
			}
			else
			{
				oddsum = oddsum+rem;
			}
			num = num/10;
		}
		System.out.println("Even digits sum : "+evensum);
		System.out.println("Odd digits sum : "+oddsum);
	}

}
