package MockTest;
import java.util.Scanner;

public class StringCat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inmate's name: ");
		String inmate = sc.nextLine();
		System.out.println("Inmate father's name: ");
		String father = sc.nextLine();
		inmate=inmate.toUpperCase();
        inmate = inmate + " ";
        father=father.toUpperCase();
        String s3=inmate.concat(father);
        char[] cs=s3.toCharArray();
        for(char c:cs) {
            if(Character.isDigit(c)||c=='!'||c=='@'||c=='#'||c=='$'||c=='%') {
                System.out.println("Invalid name");
                System.exit(0);
            }            
    }
System.out.println(s3);
	}
}
