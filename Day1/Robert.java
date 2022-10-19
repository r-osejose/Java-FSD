import java.util.*;
public class Robert{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int count=0;
	System.out.println("Enter two number:");
	int x = sc.nextInt();		
	int y = sc.nextInt();
	for(int i=1;i<=x||i<= y;i++){
		if(x%i==0 && y%i==0){
			count = count+1;
		}

}
System.out.println("Count of common factors:"+count);
}}