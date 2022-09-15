package Day2;

		import java.util.Scanner;

		public class Average {

			public static void main(String[] args) {
				float s=0,n;
				System.out.println("Average of 10 Integers");
				for(int i=1;i<=10;i++)
				{ System.out.print("Enter the number " +i+ ":" );
				Scanner scan = new Scanner(System.in);
				 n = scan.nextInt();
				 s = s+n;
				 }
					s=s/10;
					System.out.println("Average : " +s);
			}

}
