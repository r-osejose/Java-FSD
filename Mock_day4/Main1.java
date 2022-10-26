package Mock_day4;

import java.util.Scanner;

class Associate{
	
	private int associateid;
	private String associateName;
	private String workStatus;
	
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public Associate(int associateid, String associateName) {
		super();
		this.associateid = associateid;
		this.associateName = associateName;
	}
	
	public String trackAssociateStatus(int days) {
		if(days>60) {
			workStatus = "Deployed in project";
		}
		else {
			workStatus = "Training going on";
		}
		return workStatus;
	}
}

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Associate Details ");
        System.out.println("Enter the associate ID: ");
        int id = scan.nextInt();
        System.out.println("Enter the associate name: ");
        String name = scan.next();
        System.out.println("Enter the number of days: ");
        int days = scan.nextInt();
        
Associate a = new Associate(days, name);
        
        System.out.println("The associate " + a.getAssociateName() + " work status : " + a.trackAssociateStatus(days));
    

	}

}
