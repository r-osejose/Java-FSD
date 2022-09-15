package Searching;

public class LinearSearchString {

	public static void main(String[] args) {
		int i,flag=0;
		String item = "UST";
		String a[]= {"Hi","Hello","UST","Kochi","Trivandrum"};
		int n=a.length;
		for(i=0;i<n;i++) {
			if(a[i]==item) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Item'"+item+"'found at "+i);
		}else {
			System.out.println("Item not found");
		}
	}

}
