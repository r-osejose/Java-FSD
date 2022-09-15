package Day2;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=7;i>0;i--) {
			int num = i;
			while(7-num!=0) {
				System.out.print("");
				num++;
			}
			for(int j=i;j>1;j--) {
				System.out.print(1);
				System.out.print(0);
			}
			System.out.print(1);
			System.out.println("");
		}

	}

}
