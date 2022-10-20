public class Diamond2 {

	public static void main(String[] args) {
		for (int i=0;i<6;i++) {
			System.out.println();
			for(int j=0;j<=i; j++)
				System.out.print("*");
		}
		for(int i=1;i<6;i++) {
			System.out.println();
			for(int j=i;j<6;j++)
				System.out.print("*");
			}
	}

}
