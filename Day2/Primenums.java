package Day2;

public class Primenums {

	public static void main(String[] args) {
		int count;
		System.out.println("Prime Number from 0 to 100 are:");
		for(int i=2;i<=100;i++)
			{	count=0;
				for(int j=2;j<i/2;j++)	
					{if(i%j==0){
						count=1;
						break;
					}}
				if(count==0)
					{System.out.print(+i+",");}}
	}}

