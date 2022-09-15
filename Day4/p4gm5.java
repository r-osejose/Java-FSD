package Day4;
import java.util.Scanner;
public class p4gm5 {

	public static void main(String[] args) {

	int arr[][]=new int[5][5];
	int i,j;
	Scanner c=new Scanner(System.in);
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			arr[i][j]=c.nextInt();
		}
	}
	System.out.println("Array is");
	{
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
			System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}}
