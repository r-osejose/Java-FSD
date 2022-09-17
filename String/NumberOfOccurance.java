package String;

public class NumberOfOccurance {
	public static void main(String[] args) {
		int Count = 0;
		String input = "abbbccccbbaaa";
		System.out.println("String : "+input);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == 'b') {
				Count++;
			}
		}
		System.out.println("Number of occurance of b character is: "+Count);
	}
}
